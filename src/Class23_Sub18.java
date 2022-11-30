/* Class23_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub18 extends Class23
{
	protected byte[] aByteArray2374;
	protected oa anOa2375;
	
	final void method874() {
		if (anOa2375 == null) {
			anOa2375 = new oa(16);
			int[] is = new int[16];
			int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			Class96 class96 = new Class96(aByteArray2374);
			int i = class96.method1479();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class96.method1471(i_1_);
				class96.method1485(i_1_);
				class96.method1473(i_1_);
			}
		while_62_:
			for (;;) {
				int i_2_ = class96.method1475();
				int i_3_ = class96.anIntArray1625[i_2_];
				while (class96.anIntArray1625[i_2_] == i_3_) {
					class96.method1471(i_2_);
					int i_4_ = class96.method1481(i_2_);
					if (i_4_ == 1) {
						class96.method1478();
						class96.method1473(i_2_);
						if (!class96.method1477()) {
							break;
						}
						break while_62_;
					}
					int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						int i_6_ = i_4_ & 0xf;
						int i_7_ = i_4_ >> 8 & 0x7f;
						int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0) {
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						}
						if (i_7_ == 32) {
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
						}
					}
					if (i_5_ == 192) {
						int i_9_ = i_4_ & 0xf;
						int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						int i_11_ = i_4_ & 0xf;
						int i_12_ = i_4_ >> 8 & 0x7f;
						int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							int i_14_ = is_0_[i_11_];
							Class23_Sub16 class23_sub16 = (Class23_Sub16) anOa2375.a((byte) 101, (long) i_14_);
							if (class23_sub16 == null) {
								class23_sub16 = new Class23_Sub16(new byte[128]);
								anOa2375.a(class23_sub16, (byte) -14, (long) i_14_);
							}
							class23_sub16.aByteArray2359[i_12_] = (byte) 1;
						}
					}
					class96.method1485(i_2_);
					class96.method1473(i_2_);
				}
			}
		}
	}
	
	static final Class23_Sub18 method875(Class105 class105, int i, int i_15_) {
		byte[] bs = class105.method1544(i_15_, 0, i);
		if (bs == null) {
			return null;
		}
		return new Class23_Sub18(new Buffer(bs));
	}
	
	private Class23_Sub18(Buffer class23_sub5) {
		class23_sub5.position = class23_sub5.payload.length - 3;
		int i = class23_sub5.readByte();
		int i_16_ = class23_sub5.readShortBE();
		int i_17_ = 14 + i * 10;
		class23_sub5.position = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
	while_60_:
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = -1;
			for (;;) {
				int i_28_ = class23_sub5.readByte();
				if (i_28_ != i_27_) {
					i_17_++;
				}
				i_27_ = i_28_ & 0xf;
				if (i_28_ == 7) {
					continue while_60_;
				}
				if (i_28_ == 23) {
					i_18_++;
				} else if (i_27_ == 0) {
					i_20_++;
				} else if (i_27_ == 1) {
					i_21_++;
				} else if (i_27_ == 2) {
					i_19_++;
				} else if (i_27_ == 3) {
					i_22_++;
				} else if (i_27_ == 4) {
					i_23_++;
				} else if (i_27_ == 5) {
					i_24_++;
				} else {
					if (i_27_ != 6) {
						break;
					}
					i_25_++;
				}
			}
			throw new RuntimeException();
		}
		i_17_ += 5 * i_18_;
		i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
		i_17_ += i_23_ + i_25_;
		int i_29_ = class23_sub5.position;
		int i_30_ = i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			class23_sub5.method437(false);
		i_17_ += class23_sub5.position - i_29_;
		int i_32_ = class23_sub5.position;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
			i_45_ = i_45_ + class23_sub5.readByte() & 0x7f;
			if (i_45_ == 0 || i_45_ == 32) {
				i_25_++;
			} else if (i_45_ == 1) {
				i_33_++;
			} else if (i_45_ == 33) {
				i_34_++;
			} else if (i_45_ == 7) {
				i_35_++;
			} else if (i_45_ == 39) {
				i_36_++;
			} else if (i_45_ == 10) {
				i_37_++;
			} else if (i_45_ == 42) {
				i_38_++;
			} else if (i_45_ == 99) {
				i_39_++;
			} else if (i_45_ == 98) {
				i_40_++;
			} else if (i_45_ == 101) {
				i_41_++;
			} else if (i_45_ == 100) {
				i_42_++;
			} else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) {
				i_43_++;
			} else {
				i_44_++;
			}
		}
		int i_47_ = 0;
		int i_48_ = class23_sub5.position;
		class23_sub5.position += i_43_;
		int i_49_ = class23_sub5.position;
		class23_sub5.position += i_24_;
		int i_50_ = class23_sub5.position;
		class23_sub5.position += i_23_;
		int i_51_ = class23_sub5.position;
		class23_sub5.position += i_22_;
		int i_52_ = class23_sub5.position;
		class23_sub5.position += i_33_;
		int i_53_ = class23_sub5.position;
		class23_sub5.position += i_35_;
		int i_54_ = class23_sub5.position;
		class23_sub5.position += i_37_;
		int i_55_ = class23_sub5.position;
		class23_sub5.position += i_20_ + i_21_ + i_24_;
		int i_56_ = class23_sub5.position;
		class23_sub5.position += i_20_;
		int i_57_ = class23_sub5.position;
		class23_sub5.position += i_44_;
		int i_58_ = class23_sub5.position;
		class23_sub5.position += i_21_;
		int i_59_ = class23_sub5.position;
		class23_sub5.position += i_34_;
		int i_60_ = class23_sub5.position;
		class23_sub5.position += i_36_;
		int i_61_ = class23_sub5.position;
		class23_sub5.position += i_38_;
		int i_62_ = class23_sub5.position;
		class23_sub5.position += i_25_;
		int i_63_ = class23_sub5.position;
		class23_sub5.position += i_22_;
		int i_64_ = class23_sub5.position;
		class23_sub5.position += i_39_;
		int i_65_ = class23_sub5.position;
		class23_sub5.position += i_40_;
		int i_66_ = class23_sub5.position;
		class23_sub5.position += i_41_;
		int i_67_ = class23_sub5.position;
		class23_sub5.position += i_42_;
		int i_68_ = class23_sub5.position;
		class23_sub5.position += i_18_ * 3;
		aByteArray2374 = new byte[i_17_];
		Buffer class23_sub5_69_ = new Buffer(aByteArray2374);
		class23_sub5_69_.writeIntBE(1297377380, -1137894376);
		class23_sub5_69_.writeIntBE(6, -1137894376);
		class23_sub5_69_.method443(i > 1 ? 1 : 0, (byte) 51);
		class23_sub5_69_.method443(i, (byte) 51);
		class23_sub5_69_.method443(i_16_, (byte) 51);
		class23_sub5.position = i_29_;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int[] is = new int[128];
		i_45_ = 0;
		for (int i_77_ = 0; i_77_ < i; i_77_++) {
			class23_sub5_69_.writeIntBE(1297379947, -1137894376);
			class23_sub5_69_.position += 4;
			int i_78_ = class23_sub5_69_.position;
			int i_79_ = -1;
		while_61_:
			do {
				for (;;) {
					int i_80_ = class23_sub5.method437(false);
					class23_sub5_69_.method479(i_80_, 128);
					int i_81_ = class23_sub5.payload[i_47_++] & 0xff;
					boolean bool = i_81_ != i_79_;
					i_79_ = i_81_ & 0xf;
					if (i_81_ == 7) {
						if (bool) {
							class23_sub5_69_.method460((byte) 112, 255);
						}
						class23_sub5_69_.method460((byte) 127, 47);
						class23_sub5_69_.method460((byte) 111, 0);
						break while_61_;
					}
					if (i_81_ == 23) {
						if (bool) {
							class23_sub5_69_.method460((byte) 117, 255);
						}
						class23_sub5_69_.method460((byte) 123, 81);
						class23_sub5_69_.method460((byte) 123, 3);
						class23_sub5_69_.method460((byte) 111, class23_sub5.payload[i_68_++]);
						class23_sub5_69_.method460((byte) 119, class23_sub5.payload[i_68_++]);
						class23_sub5_69_.method460((byte) 125, class23_sub5.payload[i_68_++]);
					} else {
						i_70_ ^= i_81_ >> 4;
						if (i_79_ == 0) {
							if (bool) {
								class23_sub5_69_.method460((byte) 110, 144 + i_70_);
							}
							i_71_ += class23_sub5.payload[i_55_++];
							i_72_ += class23_sub5.payload[i_56_++];
							class23_sub5_69_.method460((byte) 104, i_71_ & 0x7f);
							class23_sub5_69_.method460((byte) 110, i_72_ & 0x7f);
						} else if (i_79_ == 1) {
							if (bool) {
								class23_sub5_69_.method460((byte) 114, 128 + i_70_);
							}
							i_71_ += class23_sub5.payload[i_55_++];
							i_73_ += class23_sub5.payload[i_58_++];
							class23_sub5_69_.method460((byte) 126, i_71_ & 0x7f);
							class23_sub5_69_.method460((byte) 105, i_73_ & 0x7f);
						} else if (i_79_ == 2) {
							if (bool) {
								class23_sub5_69_.method460((byte) 118, 176 + i_70_);
							}
							i_45_ = i_45_ + class23_sub5.payload[i_32_++] & 0x7f;
							class23_sub5_69_.method460((byte) 105, i_45_);
							int i_82_;
							if (i_45_ == 0 || i_45_ == 32) {
								i_82_ = class23_sub5.payload[i_62_++];
							} else if (i_45_ == 1) {
								i_82_ = class23_sub5.payload[i_52_++];
							} else if (i_45_ == 33) {
								i_82_ = class23_sub5.payload[i_59_++];
							} else if (i_45_ == 7) {
								i_82_ = class23_sub5.payload[i_53_++];
							} else if (i_45_ == 39) {
								i_82_ = class23_sub5.payload[i_60_++];
							} else if (i_45_ == 10) {
								i_82_ = class23_sub5.payload[i_54_++];
							} else if (i_45_ == 42) {
								i_82_ = class23_sub5.payload[i_61_++];
							} else if (i_45_ == 99) {
								i_82_ = class23_sub5.payload[i_64_++];
							} else if (i_45_ == 98) {
								i_82_ = class23_sub5.payload[i_65_++];
							} else if (i_45_ == 101) {
								i_82_ = class23_sub5.payload[i_66_++];
							} else if (i_45_ == 100) {
								i_82_ = class23_sub5.payload[i_67_++];
							} else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123) {
								i_82_ = class23_sub5.payload[i_48_++];
							} else {
								i_82_ = class23_sub5.payload[i_57_++];
							}
							i_82_ += is[i_45_];
							is[i_45_] = i_82_;
							class23_sub5_69_.method460((byte) 117, i_82_ & 0x7f);
						} else if (i_79_ == 3) {
							if (bool) {
								class23_sub5_69_.method460((byte) 123, 224 + i_70_);
							}
							i_74_ += class23_sub5.payload[i_63_++];
							i_74_ += class23_sub5.payload[i_51_++] << 7;
							class23_sub5_69_.method460((byte) 110, i_74_ & 0x7f);
							class23_sub5_69_.method460((byte) 122, i_74_ >> 7 & 0x7f);
						} else if (i_79_ == 4) {
							if (bool) {
								class23_sub5_69_.method460((byte) 104, 208 + i_70_);
							}
							i_75_ += class23_sub5.payload[i_50_++];
							class23_sub5_69_.method460((byte) 108, i_75_ & 0x7f);
						} else if (i_79_ == 5) {
							if (bool) {
								class23_sub5_69_.method460((byte) 122, 160 + i_70_);
							}
							i_71_ += class23_sub5.payload[i_55_++];
							i_76_ += class23_sub5.payload[i_49_++];
							class23_sub5_69_.method460((byte) 113, i_71_ & 0x7f);
							class23_sub5_69_.method460((byte) 123, i_76_ & 0x7f);
						} else {
							if (i_79_ != 6) {
								break;
							}
							if (bool) {
								class23_sub5_69_.method460((byte) 123, 192 + i_70_);
							}
							class23_sub5_69_.method460((byte) 103, class23_sub5.payload[i_62_++]);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class23_sub5_69_.method466(class23_sub5_69_.position - i_78_, 255);
		}
	}
	
	final void method876() {
		anOa2375 = null;
	}
}
