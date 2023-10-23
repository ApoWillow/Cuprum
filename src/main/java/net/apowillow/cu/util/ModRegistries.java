package net.apowillow.cu.util;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.item.ModItems;
import net.apowillow.cu.item.custom.CopperHornItem;
import net.apowillow.cu.networking.ModPackets;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrument;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrumentTags;
import net.apowillow.cu.registry.copper_horn.CopperHornRegistries;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.DispenserBlockEntity;
import net.minecraft.item.Instrument;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.InstrumentTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.event.GameEvent;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Optional;

import static net.apowillow.cu.item.custom.CopperWrenchItem.cycle;
import static net.apowillow.cu.item.custom.CopperWrenchItem.hasFacingProperty;

public class ModRegistries {
    private static final String COPPER_HORN_INSTRUMENT = "copper_horn_instrument";

    public static void registerModStuffs() {
        registerDispenserBehavior();
    }

    private static void registerDispenserBehavior() {
        DispenserBlock.registerBehavior(ModItems.COPPER_WRENCH, new FallibleItemDispenserBehavior() {
            @Override
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {

                Direction direction = pointer.state().get(DispenserBlock.FACING);
                BlockPos blockPos = pointer.pos().offset(direction);
                BlockState state = pointer.world().getBlockState(blockPos);

                if (hasFacingProperty(state)) {
                    this.setSuccess(true);
                    BlockState state2 = state;

                    if (state.getProperties().contains(Properties.FACING)) {
                        state2 = cycle(state, Properties.FACING, false);
                    } else if (state.getProperties().contains(Properties.HORIZONTAL_FACING)) {
                        state2 = cycle(state, Properties.HORIZONTAL_FACING, false);
                    } else if (state.getProperties().contains(Properties.HOPPER_FACING)) {
                        state2 = cycle(state, Properties.HOPPER_FACING, false);
                    } else if (state.getProperties().contains(Properties.AXIS)) {
                        state2 = cycle(state, Properties.AXIS, false);
                    } else if (state.getProperties().contains(Properties.HORIZONTAL_AXIS)) {
                        state2 = cycle(state, Properties.HORIZONTAL_AXIS, false);
                    }

                    pointer.world().setBlockState(blockPos, state2);
                    pointer.world().playSound(null, blockPos, state.getSoundGroup().getPlaceSound(), SoundCategory.BLOCKS, 1.0f, 1.0f);

                    pointer.world().getPlayers().forEach(serverPlayerEntity -> {
                        PacketByteBuf buffer = PacketByteBufs.create();
                        buffer.writeBlockPos(blockPos);
                        ServerPlayNetworking.send(serverPlayerEntity, ModPackets.BLOCK_BREAK_PARTICLES_SPAWN, buffer);
                    });

                } else {
                    this.setSuccess(false);
                }

                if (this.isSuccess() && stack.damage(1, pointer.world().random, null)) {
                    stack.setCount(0);
                }
                return stack;
            }
        });

        DispenserBlock.registerBehavior(Items.GOAT_HORN, new FallibleItemDispenserBehavior() {
            @Override
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack itemStack) {
                Optional<? extends RegistryEntry<Instrument>> optional = getGoatHornInstrument(itemStack);
                if (optional.isPresent()) {
                    Instrument instrument = optional.get().value();
                    String time = LocalDate.now() + "|" + LocalTime.now();

                    assert itemStack.getNbt() != null;
                    String oldTime = itemStack.getNbt().getString("lastDropperUsage");

                    if (oldTime == null || oldTime.isEmpty()) {
                        if (pointer.blockEntity().getType().equals(BlockEntityType.DISPENSER)) {
                            DispenserBlockEntity dispenserBlockEntity = pointer.blockEntity();

                            for (int i = 0; i < 9; i++) {
                                ItemStack itemStack1 = dispenserBlockEntity.getStack(i);

                                if (itemStack1.getItem().equals(Items.GOAT_HORN) || itemStack1.getItem().equals(CUMod.COPPER_HORN)) {
                                    assert itemStack1.getNbt() != null;
                                    itemStack1.getNbt().putString("lastDropperUsage", time);
                                    dispenserBlockEntity.setStack(i, itemStack1);
                                }
                            }
                        }

                        playGoatHornSound(pointer, instrument);
                        setSuccess(true);

                        return itemStack;
                    }


                    double second1 = getFloatFromString(time, 17);
                    double second2 = getFloatFromString(oldTime, 17);

                    if (Math.abs(second1 - second2) >= (double) instrument.useDuration() / 20) {
                        setSuccess(true);
                    } else {
                        short min1 = getShortFromString(time, 14, 16);
                        short min2 = getShortFromString(oldTime, 14, 16);
                        if (Math.abs(min1 - min2) >= 1) {
                            setSuccess(true);
                        } else {
                            short hour1 = getShortFromString(time, 11, 13);
                            short hour2 = getShortFromString(oldTime, 11, 13);
                            if (Math.abs(hour1 - hour2) >= 1) {
                                setSuccess(true);
                            } else {
                                short day1 = getShortFromString(time, 8, 10);
                                short day2 = getShortFromString(oldTime, 8, 10);
                                if (Math.abs(day1 - day2) >= 1) {
                                    setSuccess(true);
                                } else {
                                    short month1 = getShortFromString(time, 5, 7);
                                    short month2 = getShortFromString(oldTime, 5, 7);
                                    if (Math.abs(month1 - month2) >= 1) {
                                        setSuccess(true);
                                    } else {
                                        short year1 = getShortFromString(time, 0, 4);
                                        short year2 = getShortFromString(oldTime, 0, 4);

                                        setSuccess(Math.abs(year1 - year2) >= 1);
                                    }
                                }
                            }
                        }
                    }

                    if (this.isSuccess()) {
                        if (pointer.blockEntity().getType().equals(BlockEntityType.DISPENSER)) {
                            DispenserBlockEntity dispenserBlockEntity = pointer.blockEntity();

                            for (int i = 0; i < 9; i++) {
                                ItemStack itemStack1 = dispenserBlockEntity.getStack(i);

                                if (itemStack1.getItem().equals(Items.GOAT_HORN) || itemStack1.getItem().equals(CUMod.COPPER_HORN)) {
                                    assert itemStack1.getNbt() != null;
                                    itemStack1.getNbt().putString("lastDropperUsage", time);
                                    dispenserBlockEntity.setStack(i, itemStack1);
                                }
                            }
                        }
                        playGoatHornSound(pointer, instrument);
                    }
                }else {
                    setSuccess(false);
                }
                return itemStack;
            }

            @Override
            protected void playSound(BlockPointer pointer) {
                if (!isSuccess()){
                    super.playSound(pointer);
                }
            }
        });

        DispenserBlock.registerBehavior(CUMod.COPPER_HORN, new FallibleItemDispenserBehavior() {
            @Override
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack itemStack) {
                Optional<? extends RegistryEntry<CopperHornInstrument>> optional = getInstrument(itemStack);

                if (optional.isPresent()) {
                    CopperHornInstrument instrument = optional.get().value();
                    String time = LocalDate.now() + "|" + LocalTime.now();

                    assert itemStack.getNbt() != null;
                    String oldTime = itemStack.getNbt().getString("lastDropperUsage");

                    if (oldTime == null || oldTime.isEmpty()) {
                        if (pointer.blockEntity().getType().equals(BlockEntityType.DISPENSER)) {
                            DispenserBlockEntity dispenserBlockEntity = pointer.blockEntity();

                            for (int i = 0; i < 9; i++) {
                                ItemStack itemStack1 = dispenserBlockEntity.getStack(i);

                                if (itemStack1.getItem().equals(Items.GOAT_HORN) || itemStack1.getItem().equals(CUMod.COPPER_HORN)) {
                                    assert itemStack1.getNbt() != null;
                                    itemStack1.getNbt().putString("lastDropperUsage", time);
                                    dispenserBlockEntity.setStack(i, itemStack1);
                                }
                            }
                        }

                        setSuccess(true);
                        playCopperHornSound(pointer, instrument);
                        return itemStack;
                    }


                    double second1 = getFloatFromString(time, 17);
                    double second2 = getFloatFromString(oldTime, 17);


                    if (Math.abs(second1 - second2) >= (double) instrument.useDuration() / 20) {
                        setSuccess(true);
                    } else {
                        short min1 = getByteFromString(time, 14, 16);
                        short min2 = getByteFromString(oldTime, 14, 16);
                        if (Math.abs(min1 - min2) >= 1) {
                            setSuccess(true);
                        } else {
                            short hour1 = getByteFromString(time, 11, 13);
                            short hour2 = getByteFromString(oldTime, 11, 13);
                            if (Math.abs(hour1 - hour2) >= 1) {
                                setSuccess(true);
                            } else {
                                short day1 = getByteFromString(time, 8, 10);
                                short day2 = getByteFromString(oldTime, 8, 10);
                                if (Math.abs(day1 - day2) >= 1) {
                                    setSuccess(true);
                                } else {
                                    short month1 = getByteFromString(time, 5, 7);
                                    short month2 = getByteFromString(oldTime, 5, 7);
                                    if (Math.abs(month1 - month2) >= 1) {
                                        setSuccess(true);
                                    } else {
                                        short year1 = getShortFromString(time, 0, 4);
                                        short year2 = getShortFromString(oldTime, 0, 4);

                                        setSuccess(Math.abs(year1 - year2) >= 1);
                                    }
                                }
                            }
                        }
                    }

                    if (this.isSuccess()) {
                        if (pointer.blockEntity().getType().equals(BlockEntityType.DISPENSER)) {
                            DispenserBlockEntity dispenserBlockEntity = pointer.blockEntity();

                            for (int i = 0; i < 9; i++) {
                                ItemStack itemStack1 = dispenserBlockEntity.getStack(i);

                                if (itemStack1.getItem().equals(Items.GOAT_HORN) || itemStack1.getItem().equals(CUMod.COPPER_HORN)) {
                                    assert itemStack1.getNbt() != null;
                                    itemStack1.getNbt().putString("lastDropperUsage", time);
                                    dispenserBlockEntity.setStack(i, itemStack1);
                                }
                            }
                        }
                        playCopperHornSound(pointer, instrument);
                    }
                } else {
                    setSuccess(false);
                }

                return itemStack;
            }

            @Override
            protected void playSound(BlockPointer pointer) {
                if (!isSuccess()){
                    super.playSound(pointer);
                }
            }
        });
    }

    private static void playCopperHornSound(BlockPointer pointer, CopperHornInstrument instrument) {
        SoundEvent soundEvent = instrument.melodySoundEvent();

        if (pointer.state().getProperties().contains(Properties.FACING)) {
            if (pointer.state().get(Properties.FACING).equals(Direction.UP)) {
                soundEvent = instrument.harmonySoundEvent();

            }else if (pointer.state().get(Properties.FACING).equals(Direction.DOWN)) {
                soundEvent = instrument.bassSoundEvent();
            }
        }

        float f = instrument.range() / 16.0f;

        if (!pointer.world().isClient) {
            pointer.world().playSound(null, pointer.pos(), soundEvent, SoundCategory.RECORDS, f, 1.0f);
            pointer.world().emitGameEvent(GameEvent.INSTRUMENT_PLAY, pointer.pos(), GameEvent.Emitter.of(pointer.state()));
        }
    }

    private static void playGoatHornSound(BlockPointer pointer, Instrument instrument) {
        SoundEvent soundEvent = instrument.soundEvent().value();

        float f = instrument.range() / 16.0f;

        if (!pointer.world().isClient) {
            pointer.world().playSound(null, pointer.pos(), soundEvent, SoundCategory.RECORDS, f, 1.0f);
            pointer.world().emitGameEvent(GameEvent.INSTRUMENT_PLAY, pointer.pos(), GameEvent.Emitter.of(pointer.state()));
        }
    }

    private static Optional<? extends RegistryEntry<Instrument>> getGoatHornInstrument(ItemStack stack) {
        Identifier identifier;
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null && nbtCompound.contains("instrument", NbtElement.STRING_TYPE) && (identifier = Identifier.tryParse(nbtCompound.getString("instrument"))) != null) {
            return Registries.INSTRUMENT.getEntry(RegistryKey.of(RegistryKeys.INSTRUMENT, identifier));
        }
        Iterator<RegistryEntry<Instrument>> iterator = Registries.INSTRUMENT.iterateEntries(InstrumentTags.GOAT_HORNS).iterator();
        if (iterator.hasNext()) {
            return Optional.of(iterator.next());
        }
        return Optional.empty();
    }

    private static Optional<? extends RegistryEntry<CopperHornInstrument>> getInstrument(ItemStack stack) {
        if (stack.getItem() instanceof CopperHornItem) {

            Identifier identifier;
            NbtCompound nbtCompound = stack.getNbt();

            if (nbtCompound != null && (identifier = Identifier.tryParse(nbtCompound.getString(COPPER_HORN_INSTRUMENT))) != null) {
                return CopperHornRegistries.COPPER_HORN_INSTRUMENT.getEntry(RegistryKey.of(CopperHornInstrumentTags.COPPER_HORNS.registry(), identifier));
            }

            Iterator<RegistryEntry<CopperHornInstrument>> iterator = CopperHornRegistries.COPPER_HORN_INSTRUMENT.iterateEntries(CopperHornInstrumentTags.COPPER_HORNS).iterator();
            if (iterator.hasNext()) {
                return Optional.of(iterator.next());
            }

            return Optional.empty();
        }
        return Optional.empty();
    }

    private static double getFloatFromString(String time, int firstIndex) {
        double second = 0;

        String secondS = time.substring(firstIndex);

        try {
            second = Double.parseDouble(secondS);
        } catch (Exception ignored) {
        }
        return second;
    }

    private static short getShortFromString(String time, int firstIndex, int lastIndex) {
        short second = 0;

        String secondS = time.substring(firstIndex, lastIndex);

        try {
            second = Short.parseShort(secondS);
        } catch (Exception ignored) {
        }
        return second;
    }

    private static byte getByteFromString(String time, int firstIndex, int lastIndex) {
        byte second = 0;

        String secondS = time.substring(firstIndex, lastIndex);

        try {
            second = Byte.parseByte(secondS);
        } catch (Exception ignored) {}
        return second;
    }
}
