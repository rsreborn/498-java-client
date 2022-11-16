/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76
{
	static int anInt1383;
	static int anInt1384;
	private static int[] anIntArray1385;
	static int[] anIntArray1386;
	private static int anInt1387;
	private static float aFloat1388 = 1.0F;
	static boolean aBoolean1389 = false;
	static int anInt1390;
	private static boolean aBoolean1391;
	static int anInt1392;
	private static int[] anIntArray1393;
	static int[] anIntArray1394;
	static int[] anIntArray1395;
	static boolean aBoolean1396;
	static int[] anIntArray1397;
	static boolean aBoolean1398;
	static Interface1 anInterface1_1399;
	private static boolean aBoolean1400;
	
	static final void method1317(int i, int i_0_) {
		int i_1_ = anIntArray1393[0];
		int i_2_ = i_1_ / Class20.anInt329;
		int i_3_ = i_1_ - i_2_ * Class20.anInt329;
		anInt1383 = i - i_3_;
		anInt1392 = i_0_ - i_2_;
		Class46.anInt715 = -anInt1383;
		Class21.anInt335 = anInt1384 - anInt1383;
		Class23_Sub4_Sub35.anInt3459 = -anInt1392;
		Class23_Sub4_Sub7.anInt3023 = anInt1387 - anInt1392;
	}
	
	static final void method1318() {
		method1335(Class20.anInt333, Class20.anInt332, Class20.anInt330, Class20.anInt334);
	}
	
	private static final int method1319(int i, int i_4_) {
		i_4_ = i_4_ * (i & 0x7f) >> 7;
		if (i_4_ < 2) {
			i_4_ = 2;
		} else if (i_4_ > 126) {
			i_4_ = 126;
		}
		return (i & 0xff80) + i_4_;
	}
	
	private static final void method1320(int i, int i_5_) {
		int i_6_ = i * 128;
		for (int i_7_ = i; i_7_ < i_5_; i_7_++) {
			double d = (double) (i_7_ >> 3) / 64.0 + 0.0078125;
			double d_8_ = (double) (i_7_ & 0x7) / 8.0 + 0.0625;
			for (int i_9_ = 0; i_9_ < 128; i_9_++) {
				double d_10_ = (double) i_9_ / 128.0;
				double d_11_ = d_10_;
				double d_12_ = d_10_;
				double d_13_ = d_10_;
				if (d_8_ != 0.0) {
					double d_14_;
					if (d_10_ < 0.5) {
						d_14_ = d_10_ * (1.0 + d_8_);
					} else {
						d_14_ = d_10_ + d_8_ - d_10_ * d_8_;
					}
					double d_15_ = 2.0 * d_10_ - d_14_;
					double d_16_ = d + 0.3333333333333333;
					if (d_16_ > 1.0) {
						d_16_--;
					}
					double d_17_ = d;
					double d_18_ = d - 0.3333333333333333;
					if (d_18_ < 0.0) {
						d_18_++;
					}
					if (6.0 * d_16_ < 1.0) {
						d_11_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_16_;
					} else if (2.0 * d_16_ < 1.0) {
						d_11_ = d_14_;
					} else if (3.0 * d_16_ < 2.0) {
						d_11_ = d_15_ + (d_14_ - d_15_) * (0.6666666666666666 - d_16_) * 6.0;
					} else {
						d_11_ = d_15_;
					}
					if (6.0 * d_17_ < 1.0) {
						d_12_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_17_;
					} else if (2.0 * d_17_ < 1.0) {
						d_12_ = d_14_;
					} else if (3.0 * d_17_ < 2.0) {
						d_12_ = d_15_ + (d_14_ - d_15_) * (0.6666666666666666 - d_17_) * 6.0;
					} else {
						d_12_ = d_15_;
					}
					if (6.0 * d_18_ < 1.0) {
						d_13_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_18_;
					} else if (2.0 * d_18_ < 1.0) {
						d_13_ = d_14_;
					} else if (3.0 * d_18_ < 2.0) {
						d_13_ = d_15_ + (d_14_ - d_15_) * (0.6666666666666666 - d_18_) * 6.0;
					} else {
						d_13_ = d_15_;
					}
				}
				d_11_ = Math.pow(d_11_, (double) aFloat1388);
				d_12_ = Math.pow(d_12_, (double) aFloat1388);
				d_13_ = Math.pow(d_13_, (double) aFloat1388);
				int i_19_ = (int) (d_11_ * 256.0);
				int i_20_ = (int) (d_12_ * 256.0);
				int i_21_ = (int) (d_13_ * 256.0);
				int i_22_ = (i_19_ << 16) + (i_20_ << 8) + i_21_;
				if (i_22_ == 0) {
					i_22_ = 1;
				}
				anIntArray1397[i_6_++] = i_22_;
			}
		}
	}
	
	static final void method1321(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		int i_29_ = 0;
		if (i_23_ != i) {
			i_29_ = (i_26_ - i_25_ << 16) / (i_23_ - i);
		}
		int i_30_ = 0;
		if (i_24_ != i_23_) {
			i_30_ = (i_27_ - i_26_ << 16) / (i_24_ - i_23_);
		}
		int i_31_ = 0;
		if (i_24_ != i) {
			i_31_ = (i_25_ - i_27_ << 16) / (i - i_24_);
		}
		if (i <= i_23_ && i <= i_24_) {
			if (i < anInt1387) {
				if (i_23_ > anInt1387) {
					i_23_ = anInt1387;
				}
				if (i_24_ > anInt1387) {
					i_24_ = anInt1387;
				}
				if (i_23_ < i_24_) {
					i_27_ = i_25_ <<= 16;
					if (i < 0) {
						i_27_ -= i_31_ * i;
						i_25_ -= i_29_ * i;
						i = 0;
					}
					i_26_ <<= 16;
					if (i_23_ < 0) {
						i_26_ -= i_30_ * i_23_;
						i_23_ = 0;
					}
					if (i != i_23_ && i_31_ < i_29_ || i == i_23_ && i_31_ > i_30_) {
						i_24_ -= i_23_;
						i_23_ -= i;
						i = anIntArray1393[i];
						while (--i_23_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_27_ >> 16, i_25_ >> 16);
							i_27_ += i_31_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_27_ >> 16, i_26_ >> 16);
							i_27_ += i_31_;
							i_26_ += i_30_;
							i += Class20.anInt329;
						}
					} else {
						i_24_ -= i_23_;
						i_23_ -= i;
						i = anIntArray1393[i];
						while (--i_23_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_25_ >> 16, i_27_ >> 16);
							i_27_ += i_31_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_26_ >> 16, i_27_ >> 16);
							i_27_ += i_31_;
							i_26_ += i_30_;
							i += Class20.anInt329;
						}
					}
				} else {
					i_26_ = i_25_ <<= 16;
					if (i < 0) {
						i_26_ -= i_31_ * i;
						i_25_ -= i_29_ * i;
						i = 0;
					}
					i_27_ <<= 16;
					if (i_24_ < 0) {
						i_27_ -= i_30_ * i_24_;
						i_24_ = 0;
					}
					if (i != i_24_ && i_31_ < i_29_ || i == i_24_ && i_30_ > i_29_) {
						i_23_ -= i_24_;
						i_24_ -= i;
						i = anIntArray1393[i];
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_26_ >> 16, i_25_ >> 16);
							i_26_ += i_31_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
						while (--i_23_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_27_ >> 16, i_25_ >> 16);
							i_27_ += i_30_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
					} else {
						i_23_ -= i_24_;
						i_24_ -= i;
						i = anIntArray1393[i];
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_25_ >> 16, i_26_ >> 16);
							i_26_ += i_31_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
						while (--i_23_ >= 0) {
							method1329(Class20.anIntArray328, i, i_28_, 0, i_25_ >> 16, i_27_ >> 16);
							i_27_ += i_30_;
							i_25_ += i_29_;
							i += Class20.anInt329;
						}
					}
				}
			}
		} else if (i_23_ <= i_24_) {
			if (i_23_ < anInt1387) {
				if (i_24_ > anInt1387) {
					i_24_ = anInt1387;
				}
				if (i > anInt1387) {
					i = anInt1387;
				}
				if (i_24_ < i) {
					i_25_ = i_26_ <<= 16;
					if (i_23_ < 0) {
						i_25_ -= i_29_ * i_23_;
						i_26_ -= i_30_ * i_23_;
						i_23_ = 0;
					}
					i_27_ <<= 16;
					if (i_24_ < 0) {
						i_27_ -= i_31_ * i_24_;
						i_24_ = 0;
					}
					if (i_23_ != i_24_ && i_29_ < i_30_ || i_23_ == i_24_ && i_29_ > i_31_) {
						i -= i_24_;
						i_24_ -= i_23_;
						i_23_ = anIntArray1393[i_23_];
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_25_ >> 16, i_26_ >> 16);
							i_25_ += i_29_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
						while (--i >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_25_ >> 16, i_27_ >> 16);
							i_25_ += i_29_;
							i_27_ += i_31_;
							i_23_ += Class20.anInt329;
						}
					} else {
						i -= i_24_;
						i_24_ -= i_23_;
						i_23_ = anIntArray1393[i_23_];
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_26_ >> 16, i_25_ >> 16);
							i_25_ += i_29_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
						while (--i >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_27_ >> 16, i_25_ >> 16);
							i_25_ += i_29_;
							i_27_ += i_31_;
							i_23_ += Class20.anInt329;
						}
					}
				} else {
					i_27_ = i_26_ <<= 16;
					if (i_23_ < 0) {
						i_27_ -= i_29_ * i_23_;
						i_26_ -= i_30_ * i_23_;
						i_23_ = 0;
					}
					i_25_ <<= 16;
					if (i < 0) {
						i_25_ -= i_31_ * i;
						i = 0;
					}
					if (i_29_ < i_30_) {
						i_24_ -= i;
						i -= i_23_;
						i_23_ = anIntArray1393[i_23_];
						while (--i >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_27_ >> 16, i_26_ >> 16);
							i_27_ += i_29_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_25_ >> 16, i_26_ >> 16);
							i_25_ += i_31_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
					} else {
						i_24_ -= i;
						i -= i_23_;
						i_23_ = anIntArray1393[i_23_];
						while (--i >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_26_ >> 16, i_27_ >> 16);
							i_27_ += i_29_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
						while (--i_24_ >= 0) {
							method1329(Class20.anIntArray328, i_23_, i_28_, 0, i_26_ >> 16, i_25_ >> 16);
							i_25_ += i_31_;
							i_26_ += i_30_;
							i_23_ += Class20.anInt329;
						}
					}
				}
			}
		} else if (i_24_ < anInt1387) {
			if (i > anInt1387) {
				i = anInt1387;
			}
			if (i_23_ > anInt1387) {
				i_23_ = anInt1387;
			}
			if (i < i_23_) {
				i_26_ = i_27_ <<= 16;
				if (i_24_ < 0) {
					i_26_ -= i_30_ * i_24_;
					i_27_ -= i_31_ * i_24_;
					i_24_ = 0;
				}
				i_25_ <<= 16;
				if (i < 0) {
					i_25_ -= i_29_ * i;
					i = 0;
				}
				if (i_30_ < i_31_) {
					i_23_ -= i;
					i -= i_24_;
					i_24_ = anIntArray1393[i_24_];
					while (--i >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_26_ >> 16, i_27_ >> 16);
						i_26_ += i_30_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
					while (--i_23_ >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_26_ >> 16, i_25_ >> 16);
						i_26_ += i_30_;
						i_25_ += i_29_;
						i_24_ += Class20.anInt329;
					}
				} else {
					i_23_ -= i;
					i -= i_24_;
					i_24_ = anIntArray1393[i_24_];
					while (--i >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_27_ >> 16, i_26_ >> 16);
						i_26_ += i_30_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
					while (--i_23_ >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_25_ >> 16, i_26_ >> 16);
						i_26_ += i_30_;
						i_25_ += i_29_;
						i_24_ += Class20.anInt329;
					}
				}
			} else {
				i_25_ = i_27_ <<= 16;
				if (i_24_ < 0) {
					i_25_ -= i_30_ * i_24_;
					i_27_ -= i_31_ * i_24_;
					i_24_ = 0;
				}
				i_26_ <<= 16;
				if (i_23_ < 0) {
					i_26_ -= i_29_ * i_23_;
					i_23_ = 0;
				}
				if (i_30_ < i_31_) {
					i -= i_23_;
					i_23_ -= i_24_;
					i_24_ = anIntArray1393[i_24_];
					while (--i_23_ >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_25_ >> 16, i_27_ >> 16);
						i_25_ += i_30_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
					while (--i >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_26_ >> 16, i_27_ >> 16);
						i_26_ += i_29_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
				} else {
					i -= i_23_;
					i_23_ -= i_24_;
					i_24_ = anIntArray1393[i_24_];
					while (--i_23_ >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_27_ >> 16, i_25_ >> 16);
						i_25_ += i_30_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
					while (--i >= 0) {
						method1329(Class20.anIntArray328, i_24_, i_28_, 0, i_27_ >> 16, i_26_ >> 16);
						i_26_ += i_29_;
						i_27_ += i_31_;
						i_24_ += Class20.anInt329;
					}
				}
			}
		}
	}
	
	static final void method1322(int i, int i_32_, int i_33_) {
		aBoolean1398 = i < 0 || i > anInt1384 || i_32_ < 0 || i_32_ > anInt1384 || i_33_ < 0 || i_33_ > anInt1384;
	}
	
	private static final void method1323(int[] is, int[] is_34_, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (aBoolean1398) {
			if (i_38_ > anInt1384) {
				i_38_ = anInt1384;
			}
			if (i_37_ < 0) {
				i_37_ = 0;
			}
		}
		if (i_37_ < i_38_) {
			i_36_ += i_37_;
			i_39_ += i_40_ * i_37_;
			int i_47_ = i_38_ - i_37_;
			do {
				if (aBoolean1391) {
					int i_48_ = i_37_ - anInt1383;
					i_41_ += (i_44_ >> 3) * i_48_;
					i_42_ += (i_45_ >> 3) * i_48_;
					i_43_ += (i_46_ >> 3) * i_48_;
					int i_49_ = i_43_ >> 12;
					int i_50_;
					int i_51_;
					if (i_49_ != 0) {
						i_50_ = i_41_ / i_49_;
						i_51_ = i_42_ / i_49_;
					} else {
						i_50_ = 0;
						i_51_ = 0;
					}
					i_41_ += i_44_;
					i_42_ += i_45_;
					i_43_ += i_46_;
					i_49_ = i_43_ >> 12;
					int i_52_;
					int i_53_;
					if (i_49_ != 0) {
						i_52_ = i_41_ / i_49_;
						i_53_ = i_42_ / i_49_;
					} else {
						i_52_ = 0;
						i_53_ = 0;
					}
					i = (i_50_ << 20) + i_51_;
					int i_54_ = (i_52_ - i_50_ >> 3 << 20) + (i_53_ - i_51_ >> 3);
					i_47_ >>= 3;
					i_40_ <<= 3;
					int i_55_ = i_39_ >> 8;
					if (aBoolean1400) {
						if (i_47_ > 0) {
							do {
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
								i_50_ = i_52_;
								i_51_ = i_53_;
								i_41_ += i_44_;
								i_42_ += i_45_;
								i_43_ += i_46_;
								i_49_ = i_43_ >> 12;
								if (i_49_ != 0) {
									i_52_ = i_41_ / i_49_;
									i_53_ = i_42_ / i_49_;
								} else {
									i_52_ = 0;
									i_53_ = 0;
								}
								i = (i_50_ << 20) + i_51_;
								i_54_ = (i_52_ - i_50_ >> 3 << 20) + (i_53_ - i_51_ >> 3);
								i_39_ += i_40_;
								i_55_ = i_39_ >> 8;
							} while (--i_47_ > 0);
						}
						i_47_ = i_38_ - i_37_ & 0x7;
						if (i_47_ > 0) {
							do {
								i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)];
								is[i_36_++] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								i += i_54_;
							} while (--i_47_ > 0);
						}
					} else {
						if (i_47_ > 0) {
							do {
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
								}
								i_36_++;
								i += i_54_;
								i_50_ = i_52_;
								i_51_ = i_53_;
								i_41_ += i_44_;
								i_42_ += i_45_;
								i_43_ += i_46_;
								i_49_ = i_43_ >> 12;
								if (i_49_ != 0) {
									i_52_ = i_41_ / i_49_;
									i_53_ = i_42_ / i_49_;
								} else {
									i_52_ = 0;
									i_53_ = 0;
								}
								i = (i_50_ << 20) + i_51_;
								i_54_ = (i_52_ - i_50_ >> 3 << 20) + (i_53_ - i_51_ >> 3);
								i_39_ += i_40_;
								i_55_ = i_39_ >> 8;
							} while (--i_47_ > 0);
						}
						i_47_ = i_38_ - i_37_ & 0x7;
						if (i_47_ <= 0) {
							break;
						}
						do {
							if ((i_35_ = is_34_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_55_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_55_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_54_;
						} while (--i_47_ > 0);
					}
					break;
				}
				int i_56_ = i_37_ - anInt1383;
				i_41_ += (i_44_ >> 3) * i_56_;
				i_42_ += (i_45_ >> 3) * i_56_;
				i_43_ += (i_46_ >> 3) * i_56_;
				int i_57_ = i_43_ >> 14;
				int i_58_;
				int i_59_;
				if (i_57_ != 0) {
					i_58_ = i_41_ / i_57_;
					i_59_ = i_42_ / i_57_;
				} else {
					i_58_ = 0;
					i_59_ = 0;
				}
				i_41_ += i_44_;
				i_42_ += i_45_;
				i_43_ += i_46_;
				i_57_ = i_43_ >> 14;
				int i_60_;
				int i_61_;
				if (i_57_ != 0) {
					i_60_ = i_41_ / i_57_;
					i_61_ = i_42_ / i_57_;
				} else {
					i_60_ = 0;
					i_61_ = 0;
				}
				i = (i_58_ << 18) + i_59_;
				int i_62_ = (i_60_ - i_58_ >> 3 << 18) + (i_61_ - i_59_ >> 3);
				i_47_ >>= 3;
				i_40_ <<= 3;
				int i_63_ = i_39_ >> 8;
				if (aBoolean1400) {
					if (i_47_ > 0) {
						do {
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
							i_58_ = i_60_;
							i_59_ = i_61_;
							i_41_ += i_44_;
							i_42_ += i_45_;
							i_43_ += i_46_;
							i_57_ = i_43_ >> 14;
							if (i_57_ != 0) {
								i_60_ = i_41_ / i_57_;
								i_61_ = i_42_ / i_57_;
							} else {
								i_60_ = 0;
								i_61_ = 0;
							}
							i = (i_58_ << 18) + i_59_;
							i_62_ = (i_60_ - i_58_ >> 3 << 18) + (i_61_ - i_59_ >> 3);
							i_39_ += i_40_;
							i_63_ = i_39_ >> 8;
						} while (--i_47_ > 0);
					}
					i_47_ = i_38_ - i_37_ & 0x7;
					if (i_47_ > 0) {
						do {
							i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)];
							is[i_36_++] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							i += i_62_;
						} while (--i_47_ > 0);
						break;
					}
				} else {
					if (i_47_ > 0) {
						do {
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
							i_58_ = i_60_;
							i_59_ = i_61_;
							i_41_ += i_44_;
							i_42_ += i_45_;
							i_43_ += i_46_;
							i_57_ = i_43_ >> 14;
							if (i_57_ != 0) {
								i_60_ = i_41_ / i_57_;
								i_61_ = i_42_ / i_57_;
							} else {
								i_60_ = 0;
								i_61_ = 0;
							}
							i = (i_58_ << 18) + i_59_;
							i_62_ = (i_60_ - i_58_ >> 3 << 18) + (i_61_ - i_59_ >> 3);
							i_39_ += i_40_;
							i_63_ = i_39_ >> 8;
						} while (--i_47_ > 0);
					}
					i_47_ = i_38_ - i_37_ & 0x7;
					if (i_47_ > 0) {
						do {
							if ((i_35_ = is_34_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_36_] = ((i_35_ & 0xff00ff) * i_63_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_63_ & 0xff0000) >> 8;
							}
							i_36_++;
							i += i_62_;
						} while (--i_47_ > 0);
					}
				}
			} while (false);
		}
	}
	
	static final void method1324(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		int[] is = anInterface1_1399.method6(64, aFloat1388, i_81_);
		if (is == null) {
			int i_82_ = anInterface1_1399.method4(i_81_, (byte) 50);
			aBoolean1389 = true;
			method1333(i, i_64_, i_65_, i_66_, i_67_, i_68_, method1319(i_82_, i_69_), method1319(i_82_, i_70_), method1319(i_82_, i_71_));
		} else {
			aBoolean1391 = anInterface1_1399.method7(i_81_, false);
			aBoolean1400 = anInterface1_1399.method3(i_81_, false);
			int i_83_ = i_67_ - i_66_;
			int i_84_ = i_64_ - i;
			int i_85_ = i_68_ - i_66_;
			int i_86_ = i_65_ - i;
			int i_87_ = i_70_ - i_69_;
			int i_88_ = i_71_ - i_69_;
			int i_89_ = 0;
			if (i_64_ != i) {
				i_89_ = (i_67_ - i_66_ << 16) / (i_64_ - i);
			}
			int i_90_ = 0;
			if (i_65_ != i_64_) {
				i_90_ = (i_68_ - i_67_ << 16) / (i_65_ - i_64_);
			}
			int i_91_ = 0;
			if (i_65_ != i) {
				i_91_ = (i_66_ - i_68_ << 16) / (i - i_65_);
			}
			int i_92_ = i_83_ * i_86_ - i_85_ * i_84_;
			if (i_92_ != 0) {
				int i_93_ = (i_87_ * i_86_ - i_88_ * i_84_ << 9) / i_92_;
				int i_94_ = (i_88_ * i_83_ - i_87_ * i_85_ << 9) / i_92_;
				i_73_ = i_72_ - i_73_;
				i_76_ = i_75_ - i_76_;
				i_79_ = i_78_ - i_79_;
				i_74_ -= i_72_;
				i_77_ -= i_75_;
				i_80_ -= i_78_;
				int i_95_ = i_74_ * i_75_ - i_77_ * i_72_ << 14;
				int i_96_ = i_77_ * i_78_ - i_80_ * i_75_ << 8;
				int i_97_ = i_80_ * i_72_ - i_74_ * i_78_ << 5;
				int i_98_ = i_73_ * i_75_ - i_76_ * i_72_ << 14;
				int i_99_ = i_76_ * i_78_ - i_79_ * i_75_ << 8;
				int i_100_ = i_79_ * i_72_ - i_73_ * i_78_ << 5;
				int i_101_ = i_76_ * i_74_ - i_73_ * i_77_ << 14;
				int i_102_ = i_79_ * i_77_ - i_76_ * i_80_ << 8;
				int i_103_ = i_73_ * i_80_ - i_79_ * i_74_ << 5;
				if (i <= i_64_ && i <= i_65_) {
					if (i < anInt1387) {
						if (i_64_ > anInt1387) {
							i_64_ = anInt1387;
						}
						if (i_65_ > anInt1387) {
							i_65_ = anInt1387;
						}
						i_69_ = (i_69_ << 9) - i_93_ * i_66_ + i_93_;
						if (i_64_ < i_65_) {
							i_68_ = i_66_ <<= 16;
							if (i < 0) {
								i_68_ -= i_91_ * i;
								i_66_ -= i_89_ * i;
								i_69_ -= i_94_ * i;
								i = 0;
							}
							i_67_ <<= 16;
							if (i_64_ < 0) {
								i_67_ -= i_90_ * i_64_;
								i_64_ = 0;
							}
							int i_104_ = i - anInt1392;
							i_95_ += i_97_ * i_104_;
							i_98_ += i_100_ * i_104_;
							i_101_ += i_103_ * i_104_;
							if (i != i_64_ && i_91_ < i_89_ || i == i_64_ && i_91_ > i_90_) {
								i_65_ -= i_64_;
								i_64_ -= i;
								i = anIntArray1393[i];
								while (--i_64_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_68_ >> 16, i_66_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_91_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_68_ >> 16, i_67_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_91_;
									i_67_ += i_90_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							} else {
								i_65_ -= i_64_;
								i_64_ -= i;
								i = anIntArray1393[i];
								while (--i_64_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_66_ >> 16, i_68_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_91_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_67_ >> 16, i_68_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_91_;
									i_67_ += i_90_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							}
						} else {
							i_67_ = i_66_ <<= 16;
							if (i < 0) {
								i_67_ -= i_91_ * i;
								i_66_ -= i_89_ * i;
								i_69_ -= i_94_ * i;
								i = 0;
							}
							i_68_ <<= 16;
							if (i_65_ < 0) {
								i_68_ -= i_90_ * i_65_;
								i_65_ = 0;
							}
							int i_105_ = i - anInt1392;
							i_95_ += i_97_ * i_105_;
							i_98_ += i_100_ * i_105_;
							i_101_ += i_103_ * i_105_;
							if (i != i_65_ && i_91_ < i_89_ || i == i_65_ && i_90_ > i_89_) {
								i_64_ -= i_65_;
								i_65_ -= i;
								i = anIntArray1393[i];
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_67_ >> 16, i_66_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_67_ += i_91_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_64_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_68_ >> 16, i_66_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_90_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							} else {
								i_64_ -= i_65_;
								i_65_ -= i;
								i = anIntArray1393[i];
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_66_ >> 16, i_67_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_67_ += i_91_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_64_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i, i_66_ >> 16, i_68_ >> 16, i_69_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_90_;
									i_66_ += i_89_;
									i_69_ += i_94_;
									i += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							}
						}
					}
				} else if (i_64_ <= i_65_) {
					if (i_64_ < anInt1387) {
						if (i_65_ > anInt1387) {
							i_65_ = anInt1387;
						}
						if (i > anInt1387) {
							i = anInt1387;
						}
						i_70_ = (i_70_ << 9) - i_93_ * i_67_ + i_93_;
						if (i_65_ < i) {
							i_66_ = i_67_ <<= 16;
							if (i_64_ < 0) {
								i_66_ -= i_89_ * i_64_;
								i_67_ -= i_90_ * i_64_;
								i_70_ -= i_94_ * i_64_;
								i_64_ = 0;
							}
							i_68_ <<= 16;
							if (i_65_ < 0) {
								i_68_ -= i_91_ * i_65_;
								i_65_ = 0;
							}
							int i_106_ = i_64_ - anInt1392;
							i_95_ += i_97_ * i_106_;
							i_98_ += i_100_ * i_106_;
							i_101_ += i_103_ * i_106_;
							if (i_64_ != i_65_ && i_89_ < i_90_ || i_64_ == i_65_ && i_89_ > i_91_) {
								i -= i_65_;
								i_65_ -= i_64_;
								i_64_ = anIntArray1393[i_64_];
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_66_ >> 16, i_67_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_89_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_66_ >> 16, i_68_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_89_;
									i_68_ += i_91_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							} else {
								i -= i_65_;
								i_65_ -= i_64_;
								i_64_ = anIntArray1393[i_64_];
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_67_ >> 16, i_66_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_89_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_68_ >> 16, i_66_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_89_;
									i_68_ += i_91_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							}
						} else {
							i_68_ = i_67_ <<= 16;
							if (i_64_ < 0) {
								i_68_ -= i_89_ * i_64_;
								i_67_ -= i_90_ * i_64_;
								i_70_ -= i_94_ * i_64_;
								i_64_ = 0;
							}
							i_66_ <<= 16;
							if (i < 0) {
								i_66_ -= i_91_ * i;
								i = 0;
							}
							int i_107_ = i_64_ - anInt1392;
							i_95_ += i_97_ * i_107_;
							i_98_ += i_100_ * i_107_;
							i_101_ += i_103_ * i_107_;
							if (i_89_ < i_90_) {
								i_65_ -= i;
								i -= i_64_;
								i_64_ = anIntArray1393[i_64_];
								while (--i >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_68_ >> 16, i_67_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_89_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_66_ >> 16, i_67_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_91_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							} else {
								i_65_ -= i;
								i -= i_64_;
								i_64_ = anIntArray1393[i_64_];
								while (--i >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_67_ >> 16, i_68_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_68_ += i_89_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
								while (--i_65_ >= 0) {
									method1323(Class20.anIntArray328, is, 0, 0, i_64_, i_67_ >> 16, i_66_ >> 16, i_70_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
									i_66_ += i_91_;
									i_67_ += i_90_;
									i_70_ += i_94_;
									i_64_ += Class20.anInt329;
									i_95_ += i_97_;
									i_98_ += i_100_;
									i_101_ += i_103_;
								}
							}
						}
					}
				} else if (i_65_ < anInt1387) {
					if (i > anInt1387) {
						i = anInt1387;
					}
					if (i_64_ > anInt1387) {
						i_64_ = anInt1387;
					}
					i_71_ = (i_71_ << 9) - i_93_ * i_68_ + i_93_;
					if (i < i_64_) {
						i_67_ = i_68_ <<= 16;
						if (i_65_ < 0) {
							i_67_ -= i_90_ * i_65_;
							i_68_ -= i_91_ * i_65_;
							i_71_ -= i_94_ * i_65_;
							i_65_ = 0;
						}
						i_66_ <<= 16;
						if (i < 0) {
							i_66_ -= i_89_ * i;
							i = 0;
						}
						int i_108_ = i_65_ - anInt1392;
						i_95_ += i_97_ * i_108_;
						i_98_ += i_100_ * i_108_;
						i_101_ += i_103_ * i_108_;
						if (i_90_ < i_91_) {
							i_64_ -= i;
							i -= i_65_;
							i_65_ = anIntArray1393[i_65_];
							while (--i >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_67_ >> 16, i_68_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_90_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
							while (--i_64_ >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_67_ >> 16, i_66_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_90_;
								i_66_ += i_89_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
						} else {
							i_64_ -= i;
							i -= i_65_;
							i_65_ = anIntArray1393[i_65_];
							while (--i >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_68_ >> 16, i_67_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_90_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
							while (--i_64_ >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_66_ >> 16, i_67_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_90_;
								i_66_ += i_89_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
						}
					} else {
						i_66_ = i_68_ <<= 16;
						if (i_65_ < 0) {
							i_66_ -= i_90_ * i_65_;
							i_68_ -= i_91_ * i_65_;
							i_71_ -= i_94_ * i_65_;
							i_65_ = 0;
						}
						i_67_ <<= 16;
						if (i_64_ < 0) {
							i_67_ -= i_89_ * i_64_;
							i_64_ = 0;
						}
						int i_109_ = i_65_ - anInt1392;
						i_95_ += i_97_ * i_109_;
						i_98_ += i_100_ * i_109_;
						i_101_ += i_103_ * i_109_;
						if (i_90_ < i_91_) {
							i -= i_64_;
							i_64_ -= i_65_;
							i_65_ = anIntArray1393[i_65_];
							while (--i_64_ >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_66_ >> 16, i_68_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_66_ += i_90_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
							while (--i >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_67_ >> 16, i_68_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_89_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
						} else {
							i -= i_64_;
							i_64_ -= i_65_;
							i_65_ = anIntArray1393[i_65_];
							while (--i_64_ >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_68_ >> 16, i_66_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_66_ += i_90_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
							while (--i >= 0) {
								method1323(Class20.anIntArray328, is, 0, 0, i_65_, i_68_ >> 16, i_67_ >> 16, i_71_, i_93_, i_95_, i_98_, i_101_, i_96_, i_99_, i_102_);
								i_67_ += i_89_;
								i_68_ += i_91_;
								i_71_ += i_94_;
								i_65_ += Class20.anInt329;
								i_95_ += i_97_;
								i_98_ += i_100_;
								i_101_ += i_103_;
							}
						}
					}
				}
			}
		}
	}
	
	static final void method1325() {
		anInt1383 = anInt1384 / 2;
		anInt1392 = anInt1387 / 2;
		Class46.anInt715 = -anInt1383;
		Class21.anInt335 = anInt1384 - anInt1383;
		Class23_Sub4_Sub35.anInt3459 = -anInt1392;
		Class23_Sub4_Sub7.anInt3023 = anInt1387 - anInt1392;
	}
	
	static final void method1326(float f) {
		method1337(f);
		method1320(0, 512);
	}
	
	static final void method1327(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
		int[] is = anInterface1_1399.method6(64, aFloat1388, i_127_);
		if (is == null) {
			int i_128_ = anInterface1_1399.method4(i_127_, (byte) 50);
			method1333(i, i_110_, i_111_, i_112_, i_113_, i_114_, method1319(i_128_, i_115_), method1319(i_128_, i_116_), method1319(i_128_, i_117_));
		} else {
			aBoolean1391 = anInterface1_1399.method7(i_127_, false);
			aBoolean1400 = anInterface1_1399.method3(i_127_, false);
			int i_129_ = i_113_ - i_112_;
			int i_130_ = i_110_ - i;
			int i_131_ = i_114_ - i_112_;
			int i_132_ = i_111_ - i;
			int i_133_ = i_116_ - i_115_;
			int i_134_ = i_117_ - i_115_;
			int i_135_ = 0;
			if (i_110_ != i) {
				i_135_ = (i_113_ - i_112_ << 16) / (i_110_ - i);
			}
			int i_136_ = 0;
			if (i_111_ != i_110_) {
				i_136_ = (i_114_ - i_113_ << 16) / (i_111_ - i_110_);
			}
			int i_137_ = 0;
			if (i_111_ != i) {
				i_137_ = (i_112_ - i_114_ << 16) / (i - i_111_);
			}
			int i_138_ = i_129_ * i_132_ - i_131_ * i_130_;
			if (i_138_ != 0) {
				int i_139_ = (i_133_ * i_132_ - i_134_ * i_130_ << 9) / i_138_;
				int i_140_ = (i_134_ * i_129_ - i_133_ * i_131_ << 9) / i_138_;
				i_119_ = i_118_ - i_119_;
				i_122_ = i_121_ - i_122_;
				i_125_ = i_124_ - i_125_;
				i_120_ -= i_118_;
				i_123_ -= i_121_;
				i_126_ -= i_124_;
				int i_141_ = i_120_ * i_121_ - i_123_ * i_118_ << 14;
				int i_142_ = i_123_ * i_124_ - i_126_ * i_121_ << 5;
				int i_143_ = i_126_ * i_118_ - i_120_ * i_124_ << 5;
				int i_144_ = i_119_ * i_121_ - i_122_ * i_118_ << 14;
				int i_145_ = i_122_ * i_124_ - i_125_ * i_121_ << 5;
				int i_146_ = i_125_ * i_118_ - i_119_ * i_124_ << 5;
				int i_147_ = i_122_ * i_120_ - i_119_ * i_123_ << 14;
				int i_148_ = i_125_ * i_123_ - i_122_ * i_126_ << 5;
				int i_149_ = i_119_ * i_126_ - i_125_ * i_120_ << 5;
				if (i <= i_110_ && i <= i_111_) {
					if (i < anInt1387) {
						if (i_110_ > anInt1387) {
							i_110_ = anInt1387;
						}
						if (i_111_ > anInt1387) {
							i_111_ = anInt1387;
						}
						i_115_ = (i_115_ << 9) - i_139_ * i_112_ + i_139_;
						if (i_110_ < i_111_) {
							i_114_ = i_112_ <<= 16;
							if (i < 0) {
								i_114_ -= i_137_ * i;
								i_112_ -= i_135_ * i;
								i_115_ -= i_140_ * i;
								i = 0;
							}
							i_113_ <<= 16;
							if (i_110_ < 0) {
								i_113_ -= i_136_ * i_110_;
								i_110_ = 0;
							}
							int i_150_ = i - anInt1392;
							i_141_ += i_143_ * i_150_;
							i_144_ += i_146_ * i_150_;
							i_147_ += i_149_ * i_150_;
							if (i != i_110_ && i_137_ < i_135_ || i == i_110_ && i_137_ > i_136_) {
								i_111_ -= i_110_;
								i_110_ -= i;
								i = anIntArray1393[i];
								while (--i_110_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_114_ >> 16, i_112_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_137_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_114_ >> 16, i_113_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_137_;
									i_113_ += i_136_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							} else {
								i_111_ -= i_110_;
								i_110_ -= i;
								i = anIntArray1393[i];
								while (--i_110_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_112_ >> 16, i_114_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_137_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_113_ >> 16, i_114_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_137_;
									i_113_ += i_136_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							}
						} else {
							i_113_ = i_112_ <<= 16;
							if (i < 0) {
								i_113_ -= i_137_ * i;
								i_112_ -= i_135_ * i;
								i_115_ -= i_140_ * i;
								i = 0;
							}
							i_114_ <<= 16;
							if (i_111_ < 0) {
								i_114_ -= i_136_ * i_111_;
								i_111_ = 0;
							}
							int i_151_ = i - anInt1392;
							i_141_ += i_143_ * i_151_;
							i_144_ += i_146_ * i_151_;
							i_147_ += i_149_ * i_151_;
							if (i != i_111_ && i_137_ < i_135_ || i == i_111_ && i_136_ > i_135_) {
								i_110_ -= i_111_;
								i_111_ -= i;
								i = anIntArray1393[i];
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_113_ >> 16, i_112_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_113_ += i_137_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_110_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_114_ >> 16, i_112_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_136_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							} else {
								i_110_ -= i_111_;
								i_111_ -= i;
								i = anIntArray1393[i];
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_112_ >> 16, i_113_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_113_ += i_137_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_110_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i, i_112_ >> 16, i_114_ >> 16, i_115_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_136_;
									i_112_ += i_135_;
									i_115_ += i_140_;
									i += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							}
						}
					}
				} else if (i_110_ <= i_111_) {
					if (i_110_ < anInt1387) {
						if (i_111_ > anInt1387) {
							i_111_ = anInt1387;
						}
						if (i > anInt1387) {
							i = anInt1387;
						}
						i_116_ = (i_116_ << 9) - i_139_ * i_113_ + i_139_;
						if (i_111_ < i) {
							i_112_ = i_113_ <<= 16;
							if (i_110_ < 0) {
								i_112_ -= i_135_ * i_110_;
								i_113_ -= i_136_ * i_110_;
								i_116_ -= i_140_ * i_110_;
								i_110_ = 0;
							}
							i_114_ <<= 16;
							if (i_111_ < 0) {
								i_114_ -= i_137_ * i_111_;
								i_111_ = 0;
							}
							int i_152_ = i_110_ - anInt1392;
							i_141_ += i_143_ * i_152_;
							i_144_ += i_146_ * i_152_;
							i_147_ += i_149_ * i_152_;
							if (i_110_ != i_111_ && i_135_ < i_136_ || i_110_ == i_111_ && i_135_ > i_137_) {
								i -= i_111_;
								i_111_ -= i_110_;
								i_110_ = anIntArray1393[i_110_];
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_112_ >> 16, i_113_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_135_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_112_ >> 16, i_114_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_135_;
									i_114_ += i_137_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							} else {
								i -= i_111_;
								i_111_ -= i_110_;
								i_110_ = anIntArray1393[i_110_];
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_113_ >> 16, i_112_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_135_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_114_ >> 16, i_112_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_135_;
									i_114_ += i_137_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							}
						} else {
							i_114_ = i_113_ <<= 16;
							if (i_110_ < 0) {
								i_114_ -= i_135_ * i_110_;
								i_113_ -= i_136_ * i_110_;
								i_116_ -= i_140_ * i_110_;
								i_110_ = 0;
							}
							i_112_ <<= 16;
							if (i < 0) {
								i_112_ -= i_137_ * i;
								i = 0;
							}
							int i_153_ = i_110_ - anInt1392;
							i_141_ += i_143_ * i_153_;
							i_144_ += i_146_ * i_153_;
							i_147_ += i_149_ * i_153_;
							if (i_135_ < i_136_) {
								i_111_ -= i;
								i -= i_110_;
								i_110_ = anIntArray1393[i_110_];
								while (--i >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_114_ >> 16, i_113_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_135_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_112_ >> 16, i_113_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_137_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							} else {
								i_111_ -= i;
								i -= i_110_;
								i_110_ = anIntArray1393[i_110_];
								while (--i >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_113_ >> 16, i_114_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_114_ += i_135_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
								while (--i_111_ >= 0) {
									method1336(Class20.anIntArray328, is, 0, 0, i_110_, i_113_ >> 16, i_112_ >> 16, i_116_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
									i_112_ += i_137_;
									i_113_ += i_136_;
									i_116_ += i_140_;
									i_110_ += Class20.anInt329;
									i_141_ += i_143_;
									i_144_ += i_146_;
									i_147_ += i_149_;
								}
							}
						}
					}
				} else if (i_111_ < anInt1387) {
					if (i > anInt1387) {
						i = anInt1387;
					}
					if (i_110_ > anInt1387) {
						i_110_ = anInt1387;
					}
					i_117_ = (i_117_ << 9) - i_139_ * i_114_ + i_139_;
					if (i < i_110_) {
						i_113_ = i_114_ <<= 16;
						if (i_111_ < 0) {
							i_113_ -= i_136_ * i_111_;
							i_114_ -= i_137_ * i_111_;
							i_117_ -= i_140_ * i_111_;
							i_111_ = 0;
						}
						i_112_ <<= 16;
						if (i < 0) {
							i_112_ -= i_135_ * i;
							i = 0;
						}
						int i_154_ = i_111_ - anInt1392;
						i_141_ += i_143_ * i_154_;
						i_144_ += i_146_ * i_154_;
						i_147_ += i_149_ * i_154_;
						if (i_136_ < i_137_) {
							i_110_ -= i;
							i -= i_111_;
							i_111_ = anIntArray1393[i_111_];
							while (--i >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_113_ >> 16, i_114_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_136_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
							while (--i_110_ >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_113_ >> 16, i_112_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_136_;
								i_112_ += i_135_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
						} else {
							i_110_ -= i;
							i -= i_111_;
							i_111_ = anIntArray1393[i_111_];
							while (--i >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_114_ >> 16, i_113_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_136_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
							while (--i_110_ >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_112_ >> 16, i_113_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_136_;
								i_112_ += i_135_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
						}
					} else {
						i_112_ = i_114_ <<= 16;
						if (i_111_ < 0) {
							i_112_ -= i_136_ * i_111_;
							i_114_ -= i_137_ * i_111_;
							i_117_ -= i_140_ * i_111_;
							i_111_ = 0;
						}
						i_113_ <<= 16;
						if (i_110_ < 0) {
							i_113_ -= i_135_ * i_110_;
							i_110_ = 0;
						}
						int i_155_ = i_111_ - anInt1392;
						i_141_ += i_143_ * i_155_;
						i_144_ += i_146_ * i_155_;
						i_147_ += i_149_ * i_155_;
						if (i_136_ < i_137_) {
							i -= i_110_;
							i_110_ -= i_111_;
							i_111_ = anIntArray1393[i_111_];
							while (--i_110_ >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_112_ >> 16, i_114_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_112_ += i_136_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
							while (--i >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_113_ >> 16, i_114_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_135_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
						} else {
							i -= i_110_;
							i_110_ -= i_111_;
							i_111_ = anIntArray1393[i_111_];
							while (--i_110_ >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_114_ >> 16, i_112_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_112_ += i_136_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
							while (--i >= 0) {
								method1336(Class20.anIntArray328, is, 0, 0, i_111_, i_114_ >> 16, i_113_ >> 16, i_117_, i_139_, i_141_, i_144_, i_147_, i_142_, i_145_, i_148_);
								i_113_ += i_135_;
								i_114_ += i_137_;
								i_117_ += i_140_;
								i_111_ += Class20.anInt329;
								i_141_ += i_143_;
								i_144_ += i_146_;
								i_147_ += i_149_;
							}
						}
					}
				}
			}
		}
	}
	
	static final void method1328(Interface1 interface1) {
		anInterface1_1399 = interface1;
	}
	
	private static final void method1329(int[] is, int i, int i_156_, int i_157_, int i_158_, int i_159_) {
		if (aBoolean1398) {
			if (i_159_ > anInt1384) {
				i_159_ = anInt1384;
			}
			if (i_158_ < 0) {
				i_158_ = 0;
			}
		}
		if (i_158_ < i_159_) {
			i += i_158_;
			i_157_ = i_159_ - i_158_ >> 2;
			if (anInt1390 == 0) {
				while (--i_157_ >= 0) {
					is[i++] = i_156_;
					is[i++] = i_156_;
					is[i++] = i_156_;
					is[i++] = i_156_;
				}
				i_157_ = i_159_ - i_158_ & 0x3;
				while (--i_157_ >= 0)
					is[i++] = i_156_;
			} else if (anInt1390 == 254) {
				while (--i_157_ >= 0) {
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
				}
				i_157_ = i_159_ - i_158_ & 0x3;
				while (--i_157_ >= 0)
					is[i++] = is[i];
			} else {
				int i_160_ = anInt1390;
				int i_161_ = 256 - anInt1390;
				i_156_ = ((i_156_ & 0xff00ff) * i_161_ >> 8 & 0xff00ff) + ((i_156_ & 0xff00) * i_161_ >> 8 & 0xff00);
				while (--i_157_ >= 0) {
					int i_162_ = is[i];
					is[i++] = i_156_ + ((i_162_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_162_ & 0xff00) * i_160_ >> 8 & 0xff00);
					i_162_ = is[i];
					is[i++] = i_156_ + ((i_162_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_162_ & 0xff00) * i_160_ >> 8 & 0xff00);
					i_162_ = is[i];
					is[i++] = i_156_ + ((i_162_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_162_ & 0xff00) * i_160_ >> 8 & 0xff00);
					i_162_ = is[i];
					is[i++] = i_156_ + ((i_162_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_162_ & 0xff00) * i_160_ >> 8 & 0xff00);
				}
				i_157_ = i_159_ - i_158_ & 0x3;
				while (--i_157_ >= 0) {
					int i_163_ = is[i];
					is[i++] = i_156_ + ((i_163_ & 0xff00ff) * i_160_ >> 8 & 0xff00ff) + ((i_163_ & 0xff00) * i_160_ >> 8 & 0xff00);
				}
			}
		}
	}
	
	static final int method1330() {
		return anIntArray1393[0] % Class20.anInt329;
	}
	
	static final int method1331() {
		return anIntArray1393[0] / Class20.anInt329;
	}
	
	public static void method1332() {
		anIntArray1393 = null;
		anIntArray1397 = null;
		anInterface1_1399 = null;
		anIntArray1385 = null;
		anIntArray1394 = null;
		anIntArray1386 = null;
		anIntArray1395 = null;
	}
	
	static final void method1333(int i, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		int i_172_ = i_167_ - i_166_;
		int i_173_ = i_164_ - i;
		int i_174_ = i_168_ - i_166_;
		int i_175_ = i_165_ - i;
		int i_176_ = i_170_ - i_169_;
		int i_177_ = i_171_ - i_169_;
		int i_178_;
		if (i_165_ != i_164_) {
			i_178_ = (i_168_ - i_167_ << 16) / (i_165_ - i_164_);
		} else {
			i_178_ = 0;
		}
		int i_179_;
		if (i_164_ != i) {
			i_179_ = (i_172_ << 16) / i_173_;
		} else {
			i_179_ = 0;
		}
		int i_180_;
		if (i_165_ != i) {
			i_180_ = (i_174_ << 16) / i_175_;
		} else {
			i_180_ = 0;
		}
		int i_181_ = i_172_ * i_175_ - i_174_ * i_173_;
		if (i_181_ != 0) {
			int i_182_ = (i_176_ * i_175_ - i_177_ * i_173_ << 8) / i_181_;
			int i_183_ = (i_177_ * i_172_ - i_176_ * i_174_ << 8) / i_181_;
			if (i <= i_164_ && i <= i_165_) {
				if (i < anInt1387) {
					if (i_164_ > anInt1387) {
						i_164_ = anInt1387;
					}
					if (i_165_ > anInt1387) {
						i_165_ = anInt1387;
					}
					i_169_ = (i_169_ << 8) - i_182_ * i_166_ + i_182_;
					if (i_164_ < i_165_) {
						i_168_ = i_166_ <<= 16;
						if (i < 0) {
							i_168_ -= i_180_ * i;
							i_166_ -= i_179_ * i;
							i_169_ -= i_183_ * i;
							i = 0;
						}
						i_167_ <<= 16;
						if (i_164_ < 0) {
							i_167_ -= i_178_ * i_164_;
							i_164_ = 0;
						}
						if (i != i_164_ && i_180_ < i_179_ || i == i_164_ && i_180_ > i_178_) {
							i_165_ -= i_164_;
							i_164_ -= i;
							i = anIntArray1393[i];
							while (--i_164_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_168_ >> 16, i_166_ >> 16, i_169_, i_182_);
								i_168_ += i_180_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_168_ >> 16, i_167_ >> 16, i_169_, i_182_);
								i_168_ += i_180_;
								i_167_ += i_178_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
						} else {
							i_165_ -= i_164_;
							i_164_ -= i;
							i = anIntArray1393[i];
							while (--i_164_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_166_ >> 16, i_168_ >> 16, i_169_, i_182_);
								i_168_ += i_180_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_167_ >> 16, i_168_ >> 16, i_169_, i_182_);
								i_168_ += i_180_;
								i_167_ += i_178_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
						}
					} else {
						i_167_ = i_166_ <<= 16;
						if (i < 0) {
							i_167_ -= i_180_ * i;
							i_166_ -= i_179_ * i;
							i_169_ -= i_183_ * i;
							i = 0;
						}
						i_168_ <<= 16;
						if (i_165_ < 0) {
							i_168_ -= i_178_ * i_165_;
							i_165_ = 0;
						}
						if (i != i_165_ && i_180_ < i_179_ || i == i_165_ && i_178_ > i_179_) {
							i_164_ -= i_165_;
							i_165_ -= i;
							i = anIntArray1393[i];
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_167_ >> 16, i_166_ >> 16, i_169_, i_182_);
								i_167_ += i_180_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
							while (--i_164_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_168_ >> 16, i_166_ >> 16, i_169_, i_182_);
								i_168_ += i_178_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
						} else {
							i_164_ -= i_165_;
							i_165_ -= i;
							i = anIntArray1393[i];
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_166_ >> 16, i_167_ >> 16, i_169_, i_182_);
								i_167_ += i_180_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
							while (--i_164_ >= 0) {
								method1334(Class20.anIntArray328, i, 0, 0, i_166_ >> 16, i_168_ >> 16, i_169_, i_182_);
								i_168_ += i_178_;
								i_166_ += i_179_;
								i_169_ += i_183_;
								i += Class20.anInt329;
							}
						}
					}
				}
			} else if (i_164_ <= i_165_) {
				if (i_164_ < anInt1387) {
					if (i_165_ > anInt1387) {
						i_165_ = anInt1387;
					}
					if (i > anInt1387) {
						i = anInt1387;
					}
					i_170_ = (i_170_ << 8) - i_182_ * i_167_ + i_182_;
					if (i_165_ < i) {
						i_166_ = i_167_ <<= 16;
						if (i_164_ < 0) {
							i_166_ -= i_179_ * i_164_;
							i_167_ -= i_178_ * i_164_;
							i_170_ -= i_183_ * i_164_;
							i_164_ = 0;
						}
						i_168_ <<= 16;
						if (i_165_ < 0) {
							i_168_ -= i_180_ * i_165_;
							i_165_ = 0;
						}
						if (i_164_ != i_165_ && i_179_ < i_178_ || i_164_ == i_165_ && i_179_ > i_180_) {
							i -= i_165_;
							i_165_ -= i_164_;
							i_164_ = anIntArray1393[i_164_];
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_166_ >> 16, i_167_ >> 16, i_170_, i_182_);
								i_166_ += i_179_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
							while (--i >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_166_ >> 16, i_168_ >> 16, i_170_, i_182_);
								i_166_ += i_179_;
								i_168_ += i_180_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
						} else {
							i -= i_165_;
							i_165_ -= i_164_;
							i_164_ = anIntArray1393[i_164_];
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_167_ >> 16, i_166_ >> 16, i_170_, i_182_);
								i_166_ += i_179_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
							while (--i >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_168_ >> 16, i_166_ >> 16, i_170_, i_182_);
								i_166_ += i_179_;
								i_168_ += i_180_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
						}
					} else {
						i_168_ = i_167_ <<= 16;
						if (i_164_ < 0) {
							i_168_ -= i_179_ * i_164_;
							i_167_ -= i_178_ * i_164_;
							i_170_ -= i_183_ * i_164_;
							i_164_ = 0;
						}
						i_166_ <<= 16;
						if (i < 0) {
							i_166_ -= i_180_ * i;
							i = 0;
						}
						if (i_179_ < i_178_) {
							i_165_ -= i;
							i -= i_164_;
							i_164_ = anIntArray1393[i_164_];
							while (--i >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_168_ >> 16, i_167_ >> 16, i_170_, i_182_);
								i_168_ += i_179_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_166_ >> 16, i_167_ >> 16, i_170_, i_182_);
								i_166_ += i_180_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
						} else {
							i_165_ -= i;
							i -= i_164_;
							i_164_ = anIntArray1393[i_164_];
							while (--i >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_167_ >> 16, i_168_ >> 16, i_170_, i_182_);
								i_168_ += i_179_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
							while (--i_165_ >= 0) {
								method1334(Class20.anIntArray328, i_164_, 0, 0, i_167_ >> 16, i_166_ >> 16, i_170_, i_182_);
								i_166_ += i_180_;
								i_167_ += i_178_;
								i_170_ += i_183_;
								i_164_ += Class20.anInt329;
							}
						}
					}
				}
			} else if (i_165_ < anInt1387) {
				if (i > anInt1387) {
					i = anInt1387;
				}
				if (i_164_ > anInt1387) {
					i_164_ = anInt1387;
				}
				i_171_ = (i_171_ << 8) - i_182_ * i_168_ + i_182_;
				if (i < i_164_) {
					i_167_ = i_168_ <<= 16;
					if (i_165_ < 0) {
						i_167_ -= i_178_ * i_165_;
						i_168_ -= i_180_ * i_165_;
						i_171_ -= i_183_ * i_165_;
						i_165_ = 0;
					}
					i_166_ <<= 16;
					if (i < 0) {
						i_166_ -= i_179_ * i;
						i = 0;
					}
					if (i_178_ < i_180_) {
						i_164_ -= i;
						i -= i_165_;
						i_165_ = anIntArray1393[i_165_];
						while (--i >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_167_ >> 16, i_168_ >> 16, i_171_, i_182_);
							i_167_ += i_178_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
						while (--i_164_ >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_167_ >> 16, i_166_ >> 16, i_171_, i_182_);
							i_167_ += i_178_;
							i_166_ += i_179_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
					} else {
						i_164_ -= i;
						i -= i_165_;
						i_165_ = anIntArray1393[i_165_];
						while (--i >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_168_ >> 16, i_167_ >> 16, i_171_, i_182_);
							i_167_ += i_178_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
						while (--i_164_ >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_166_ >> 16, i_167_ >> 16, i_171_, i_182_);
							i_167_ += i_178_;
							i_166_ += i_179_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
					}
				} else {
					i_166_ = i_168_ <<= 16;
					if (i_165_ < 0) {
						i_166_ -= i_178_ * i_165_;
						i_168_ -= i_180_ * i_165_;
						i_171_ -= i_183_ * i_165_;
						i_165_ = 0;
					}
					i_167_ <<= 16;
					if (i_164_ < 0) {
						i_167_ -= i_179_ * i_164_;
						i_164_ = 0;
					}
					if (i_178_ < i_180_) {
						i -= i_164_;
						i_164_ -= i_165_;
						i_165_ = anIntArray1393[i_165_];
						while (--i_164_ >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_166_ >> 16, i_168_ >> 16, i_171_, i_182_);
							i_166_ += i_178_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
						while (--i >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_167_ >> 16, i_168_ >> 16, i_171_, i_182_);
							i_167_ += i_179_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
					} else {
						i -= i_164_;
						i_164_ -= i_165_;
						i_165_ = anIntArray1393[i_165_];
						while (--i_164_ >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_168_ >> 16, i_166_ >> 16, i_171_, i_182_);
							i_166_ += i_178_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
						while (--i >= 0) {
							method1334(Class20.anIntArray328, i_165_, 0, 0, i_168_ >> 16, i_167_ >> 16, i_171_, i_182_);
							i_167_ += i_179_;
							i_168_ += i_180_;
							i_171_ += i_183_;
							i_165_ += Class20.anInt329;
						}
					}
				}
			}
		}
	}
	
	private static final void method1334(int[] is, int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_) {
		if (aBoolean1398) {
			if (i_187_ > anInt1384) {
				i_187_ = anInt1384;
			}
			if (i_186_ < 0) {
				i_186_ = 0;
			}
		}
		if (i_186_ < i_187_) {
			i += i_186_;
			i_188_ += i_189_ * i_186_;
			if (aBoolean1396) {
				i_185_ = i_187_ - i_186_ >> 2;
				i_189_ <<= 2;
				if (anInt1390 == 0) {
					if (i_185_ > 0) {
						do {
							i_184_ = anIntArray1397[i_188_ >> 8];
							i_188_ += i_189_;
							is[i++] = i_184_;
							is[i++] = i_184_;
							is[i++] = i_184_;
							is[i++] = i_184_;
						} while (--i_185_ > 0);
					}
					i_185_ = i_187_ - i_186_ & 0x3;
					if (i_185_ > 0) {
						i_184_ = anIntArray1397[i_188_ >> 8];
						do
							is[i++] = i_184_;
						while (--i_185_ > 0);
					}
				} else {
					int i_190_ = anInt1390;
					int i_191_ = 256 - anInt1390;
					if (i_185_ > 0) {
						do {
							i_184_ = anIntArray1397[i_188_ >> 8];
							i_188_ += i_189_;
							i_184_ = ((i_184_ & 0xff00ff) * i_191_ >> 8 & 0xff00ff) + ((i_184_ & 0xff00) * i_191_ >> 8 & 0xff00);
							int i_192_ = is[i];
							is[i++] = i_184_ + ((i_192_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_192_ & 0xff00) * i_190_ >> 8 & 0xff00);
							i_192_ = is[i];
							is[i++] = i_184_ + ((i_192_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_192_ & 0xff00) * i_190_ >> 8 & 0xff00);
							i_192_ = is[i];
							is[i++] = i_184_ + ((i_192_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_192_ & 0xff00) * i_190_ >> 8 & 0xff00);
							i_192_ = is[i];
							is[i++] = i_184_ + ((i_192_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_192_ & 0xff00) * i_190_ >> 8 & 0xff00);
						} while (--i_185_ > 0);
					}
					i_185_ = i_187_ - i_186_ & 0x3;
					if (i_185_ > 0) {
						i_184_ = anIntArray1397[i_188_ >> 8];
						i_184_ = ((i_184_ & 0xff00ff) * i_191_ >> 8 & 0xff00ff) + ((i_184_ & 0xff00) * i_191_ >> 8 & 0xff00);
						do {
							int i_193_ = is[i];
							is[i++] = i_184_ + ((i_193_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_193_ & 0xff00) * i_190_ >> 8 & 0xff00);
						} while (--i_185_ > 0);
					}
				}
			} else {
				i_185_ = i_187_ - i_186_;
				if (anInt1390 == 0) {
					do {
						is[i++] = anIntArray1397[i_188_ >> 8];
						i_188_ += i_189_;
					} while (--i_185_ > 0);
				} else {
					int i_194_ = anInt1390;
					int i_195_ = 256 - anInt1390;
					do {
						i_184_ = anIntArray1397[i_188_ >> 8];
						i_188_ += i_189_;
						i_184_ = ((i_184_ & 0xff00ff) * i_195_ >> 8 & 0xff00ff) + ((i_184_ & 0xff00) * i_195_ >> 8 & 0xff00);
						int i_196_ = is[i];
						is[i++] = i_184_ + ((i_196_ & 0xff00ff) * i_194_ >> 8 & 0xff00ff) + ((i_196_ & 0xff00) * i_194_ >> 8 & 0xff00);
					} while (--i_185_ > 0);
				}
			}
		}
	}
	
	private static final void method1335(int i, int i_197_, int i_198_, int i_199_) {
		anInt1384 = i_198_ - i;
		anInt1387 = i_199_ - i_197_;
		method1325();
		if (anIntArray1393.length < anInt1387) {
			anIntArray1393 = new int[RuntimeException_Sub1.method1586((byte) -64, anInt1387)];
		}
		int i_200_ = i_197_ * Class20.anInt329 + i;
		for (int i_201_ = 0; i_201_ < anInt1387; i_201_++) {
			anIntArray1393[i_201_] = i_200_;
			i_200_ += Class20.anInt329;
		}
	}
	
	private static final void method1336(int[] is, int[] is_202_, int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_) {
		if (aBoolean1398) {
			if (i_206_ > anInt1384) {
				i_206_ = anInt1384;
			}
			if (i_205_ < 0) {
				i_205_ = 0;
			}
		}
		if (i_205_ < i_206_) {
			i_204_ += i_205_;
			i_207_ += i_208_ * i_205_;
			int i_215_ = i_206_ - i_205_;
			do {
				if (aBoolean1391) {
					int i_216_ = i_205_ - anInt1383;
					i_209_ += i_212_ * i_216_;
					i_210_ += i_213_ * i_216_;
					i_211_ += i_214_ * i_216_;
					int i_217_ = i_211_ >> 12;
					int i_218_;
					int i_219_;
					if (i_217_ != 0) {
						i_218_ = i_209_ / i_217_;
						i_219_ = i_210_ / i_217_;
					} else {
						i_218_ = 0;
						i_219_ = 0;
					}
					i_209_ += i_212_ * i_215_;
					i_210_ += i_213_ * i_215_;
					i_211_ += i_214_ * i_215_;
					i_217_ = i_211_ >> 12;
					int i_220_;
					int i_221_;
					if (i_217_ != 0) {
						i_220_ = i_209_ / i_217_;
						i_221_ = i_210_ / i_217_;
					} else {
						i_220_ = 0;
						i_221_ = 0;
					}
					i = (i_218_ << 20) + i_219_;
					int i_222_ = ((i_220_ - i_218_) / i_215_ << 20) + (i_221_ - i_219_) / i_215_;
					i_215_ >>= 3;
					i_208_ <<= 3;
					int i_223_ = i_207_ >> 8;
					if (aBoolean1400) {
						if (i_215_ > 0) {
							do {
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
								i_207_ += i_208_;
								i_223_ = i_207_ >> 8;
							} while (--i_215_ > 0);
						}
						i_215_ = i_206_ - i_205_ & 0x7;
						if (i_215_ > 0) {
							do {
								i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)];
								is[i_204_++] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								i += i_222_;
							} while (--i_215_ > 0);
						}
					} else {
						if (i_215_ > 0) {
							do {
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
									is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
								}
								i_204_++;
								i += i_222_;
								i_207_ += i_208_;
								i_223_ = i_207_ >> 8;
							} while (--i_215_ > 0);
						}
						i_215_ = i_206_ - i_205_ & 0x7;
						if (i_215_ <= 0) {
							break;
						}
						do {
							if ((i_203_ = is_202_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_223_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_223_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_222_;
						} while (--i_215_ > 0);
					}
					break;
				}
				int i_224_ = i_205_ - anInt1383;
				i_209_ += i_212_ * i_224_;
				i_210_ += i_213_ * i_224_;
				i_211_ += i_214_ * i_224_;
				int i_225_ = i_211_ >> 14;
				int i_226_;
				int i_227_;
				if (i_225_ != 0) {
					i_226_ = i_209_ / i_225_;
					i_227_ = i_210_ / i_225_;
				} else {
					i_226_ = 0;
					i_227_ = 0;
				}
				i_209_ += i_212_ * i_215_;
				i_210_ += i_213_ * i_215_;
				i_211_ += i_214_ * i_215_;
				i_225_ = i_211_ >> 14;
				int i_228_;
				int i_229_;
				if (i_225_ != 0) {
					i_228_ = i_209_ / i_225_;
					i_229_ = i_210_ / i_225_;
				} else {
					i_228_ = 0;
					i_229_ = 0;
				}
				i = (i_226_ << 18) + i_227_;
				int i_230_ = ((i_228_ - i_226_) / i_215_ << 18) + (i_229_ - i_227_) / i_215_;
				i_215_ >>= 3;
				i_208_ <<= 3;
				int i_231_ = i_207_ >> 8;
				if (aBoolean1400) {
					if (i_215_ > 0) {
						do {
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
							i_207_ += i_208_;
							i_231_ = i_207_ >> 8;
						} while (--i_215_ > 0);
					}
					i_215_ = i_206_ - i_205_ & 0x7;
					if (i_215_ > 0) {
						do {
							i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)];
							is[i_204_++] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							i += i_230_;
						} while (--i_215_ > 0);
						break;
					}
				} else {
					if (i_215_ > 0) {
						do {
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
							i_207_ += i_208_;
							i_231_ = i_207_ >> 8;
						} while (--i_215_ > 0);
					}
					i_215_ = i_206_ - i_205_ & 0x7;
					if (i_215_ > 0) {
						do {
							if ((i_203_ = is_202_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_204_] = ((i_203_ & 0xff00ff) * i_231_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_231_ & 0xff0000) >> 8;
							}
							i_204_++;
							i += i_230_;
						} while (--i_215_ > 0);
					}
				}
			} while (false);
		}
	}
	
	private static final void method1337(float f) {
		aFloat1388 = f;
		aFloat1388 += Math.random() * 0.03 - 0.015;
	}
	
	static {
		anIntArray1385 = new int[512];
		anIntArray1394 = new int[2048];
		anIntArray1393 = new int[1024];
		aBoolean1391 = false;
		anInt1390 = 0;
		anIntArray1395 = new int[2048];
		anIntArray1386 = new int[2048];
		aBoolean1398 = false;
		aBoolean1396 = true;
		anIntArray1397 = new int[65536];
		aBoolean1400 = false;
		for (int i = 1; i < 512; i++)
			anIntArray1385[i] = 32768 / i;
		for (int i = 1; i < 2048; i++)
			anIntArray1394[i] = 65536 / i;
		for (int i = 0; i < 2048; i++) {
			anIntArray1386[i] = (int) (65536.0 * Math.sin((double) i * 0.0030679615));
			anIntArray1395[i] = (int) (65536.0 * Math.cos((double) i * 0.0030679615));
		}
	}
}
