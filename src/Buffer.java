/* Class23_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.math.BigInteger;

class Buffer extends Class23 {
    static int anInt2126;
    static int loginStage = 0;
    static int anInt2128;
    static int anInt2129;
    static int anInt2130;
    static int anInt2131;
    static Class34 aClass34_2132;
    static int anInt2133;
    static int anInt2134;
    static int anInt2135;
    static int anInt2136;
    static int anInt2137;
    static int anInt2138;
    static int anInt2139;
    static int anInt2140;
    static int anInt2141;
    static int anInt2142;
    static int anInt2143;
    static int anInt2144;
    static int anInt2145;
    static int anInt2146;
    static int anInt2147;
    static int anInt2148;
    static int anInt2149;
    static int anInt2150;
    static int anInt2151;
    static int anInt2152;
    static int anInt2153;
    static int anInt2154;
    static int anInt2155;
    static int anInt2156;
    static int anInt2157;
    static int anInt2158;
    static boolean aBoolean2159;
    static int anInt2160;
    static int anInt2161;
    protected byte[] payload;
    static RSString aClass16_2163;
    static int anInt2164;
    static int anInt2165;
    static int anInt2166;
    static int anInt2167;
    private static RSString aClass16_2168;
    static RSString aClass16_2169 = Class38_Sub6.method1076((byte) 86, " )2> <col=ffffff>");
    static int anInt2170;
    static int anInt2171;
    static int anInt2172;
    static int anInt2173;
    static int anInt2174;
    static int anInt2175;
    static int anInt2176;
    static int anInt2177;
    static int anInt2178;
    static int anInt2179;
    static int anInt2180;
    static int anInt2181;
    static int anInt2182;
    static int anInt2183;
    static int anInt2184;
    static int anInt2185;
    protected int pos;
    static int anInt2187;
    static int anInt2188;
    static int anInt2189;
    static int anInt2190;
    static int anInt2191;
    static int anInt2192;

    final RSString readString(int i) {
        if (i != 2) {
            aClass16_2163 = null;
        }
        anInt2179++;
        int i_0_ = pos;
        while ((payload[pos++] ^ 0xffffffff) != -1) {
            /* empty */
        }
        return Class46.method1139(payload, 0, pos - (i_0_ + 1), i_0_);
    }

    final void putLEShortA(int i, int i_1_) {
        payload[pos++] = (byte) (i + 128);
        if (i_1_ != -1371695448) {
            putLong2(-72L, 42);
        }
        anInt2147++;
        payload[pos++] = (byte) (i >> 8);
    }

    final void putS(int i, int i_2_) {
        payload[pos++] = (byte) (128 + -i);
        anInt2154++;
        if (i_2_ != -572365016) {
            getTriByte(123);
        }
    }

    final void putInt(int i, int i_3_) {
        anInt2143++;
        payload[pos++] = (byte) (i >> 24);
        payload[pos++] = (byte) (i >> 16);
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) i;
        if (i_3_ != -1137894376) {
            loginStage = 23;
        }
    }

    final void writeShortLE(int i) {
        payload[pos++] = (byte) i;
        anInt2161++;
        payload[pos++] = (byte) (i >> 8);
    }

    final int method431(int i, int i_5_) {
        int i_6_ = Class36.method989(i_5_, pos, (byte) -118, payload);
        anInt2131++;
        putInt(i_6_, -1137894376);
        if (i != 32258) {
            pos = -41;
        }
        return i_6_;
    }

    final int getSmart(byte b) {
        anInt2189++;
        if (b < 10) {
            return 17;
        }
        int i = 0xff & payload[pos];
        if (i >= 128) {
            return -32768 + getUShortBE();
        }
        return readUByte();
    }

    final byte method433(int i) {
        if (i != -75) {
            return (byte) 74;
        }
        anInt2157++;
        return (byte) -payload[pos++];
    }

    final byte method434(byte b) {
        if (b <= 2) {
            pos = 117;
        }
        anInt2136++;
        return (byte) (-128 + payload[pos++]);
    }

    final int method435(byte b) {
        if (b <= 76) {
            aClass16_2169 = null;
        }
        anInt2180++;
        return -128 + payload[pos++] & 0xff;
    }

    final void putLong(long l, byte b) {
        payload[pos++] = (byte) (int) (l >> 56);
        payload[pos++] = (byte) (int) (l >> 48);
        payload[pos++] = (byte) (int) (l >> 40);
        anInt2126++;
        if (b < -107) {
            payload[pos++] = (byte) (int) (l >> 32);
            payload[pos++] = (byte) (int) (l >> 24);
            payload[pos++] = (byte) (int) (l >> 16);
            payload[pos++] = (byte) (int) (l >> 8);
            payload[pos++] = (byte) (int) l;
        }
    }

    final int method437(boolean bool) {
        anInt2134++;
        int i = payload[pos++];
        int i_7_ = 0;
        for (/**/; (i ^ 0xffffffff) > -1; i = payload[pos++])
            i_7_ = (0x7f & i | i_7_) << 7;
        if (bool != false) {
            aClass34_2132 = null;
        }
        return i_7_ | i;
    }

    final void method438(int i, int i_8_, byte[] bs, int i_9_) {
        if (i_8_ >= 10) {
            for (int i_10_ = i; (i_10_ ^ 0xffffffff) > (i + i_9_ ^ 0xffffffff); i_10_++)
                payload[pos++] = bs[i_10_];
            anInt2176++;
        }
    }

    final void putLEInt(byte b, int i) {
        anInt2149++;
        payload[pos++] = (byte) i;
        if (b > -60) {
            anInt2166 = 51;
        }
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) (i >> 16);
        payload[pos++] = (byte) (i >> 24);
    }

    final byte method440(int i) {
        if (i != -18402) {
            loginStage = -122;
        }
        anInt2142++;
        return (byte) (-payload[pos++] + 128);
    }

    final int method441(int i) {
        anInt2185++;
        int i_11_ = -90 % ((54 - i) / 46);
        pos += 4;
        return (payload[-4 + pos] & 0xff) + ((payload[-2 + pos] & 0xff) << 16) + (((0xff & payload[pos + -1]) << 24) - -(0xff00 & payload[pos + -3] << 8));
    }

    final int getLEShortA(int i) {
        anInt2167++;
        pos += 2;
        if (i < 122) {
            aClass16_2169 = null;
        }
        return (0xff & payload[-2 + pos] - 128) + (0xff00 & payload[pos + -1] << 8);
    }

    final void putShort(int i, byte b) {
        payload[pos++] = (byte) (i >> 8);
        if (b != 51) {
            aClass16_2169 = null;
        }
        anInt2140++;
        payload[pos++] = (byte) i;
    }

    static final void method444(int i) {
        anInt2177++;
        Class5.anInt104++;
        Class23_Sub7.aClass23_Sub5_Sub1_2202.writeOpcode(95, 2976);
        if (i != -7602) {
            method470((byte) -31, null);
        }
        for (Class23_Sub25 class23_sub25 = (Class23_Sub25) Class36.anOa565.a((byte) -25); class23_sub25 != null; class23_sub25 = (Class23_Sub25) Class36.anOa565.a(true)) {
            if ((class23_sub25.anInt2461 ^ 0xffffffff) == -1) {
                Applet_Sub1.method27(true, i + -20759, class23_sub25);
            }
        }
        if (Class23_Sub13_Sub14.aClass64_4007 != null) {
            Class91.method1450((byte) 29, Class23_Sub13_Sub14.aClass64_4007);
            Class23_Sub13_Sub14.aClass64_4007 = null;
        }
    }

    final void putInt1(int i, byte b) {
        anInt2141++;
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) i;
        payload[pos++] = (byte) (i >> 24);
        if (b != 66) {
            method479(73, 8);
        }
        payload[pos++] = (byte) (i >> 16);
    }

    final void method446(RSString class16, int i) {
        if (i >= -68) {
            aClass16_2169 = null;
        }
        pos += class16.method137(0, pos, class16.method171(-61), payload, 2514);
        payload[pos++] = (byte) 0;
        anInt2171++;
    }

    //REVIEW THIS
    final int getSmarts(byte b) {
        anInt2158++;
        int i = 0;
        if (b >= -98) {
            getSmart((byte) 45);
        }
        int i_12_ = getSmart((byte) 71);
        while ((i_12_ ^ 0xffffffff) == -32768) {
            i_12_ = getSmart((byte) 43);
            i += 32767;
        }
        i += i_12_;
        return i;
    }

    final void method448(int i, int i_13_, long l) {
        if (i <= 2) {
            getTriByte(-117);
        }
        anInt2129++;
        if ((--i_13_ ^ 0xffffffff) > -1 || i_13_ > 7) {
            throw new IllegalArgumentException();
        }
        for (int i_14_ = i_13_ * 8; (i_14_ ^ 0xffffffff) <= -1; i_14_ -= 8)
            payload[pos++] = (byte) (int) (l >> i_14_);
    }

    final long method449(int i, int i_15_) {
        anInt2170++;
        if ((--i ^ 0xffffffff) > -1 || i > 7) {
            throw new IllegalArgumentException();
        }
        int i_16_ = i * 8;
        long l = (long) i_15_;
        for (/**/; i_16_ >= 0; i_16_ -= 8)
            l |= ((long) payload[pos++] & 0xffL) << i_16_;
        return l;
    }

    final void readBytes(byte[] data, int offset, int length) {
        int i = offset;
        for (/**/; length + offset > i; i++)
            data[i] = payload[pos++];
        anInt2137++;
    }

    final RSString method451(byte b) {
        anInt2152++;
        int i = 10 % ((-52 - b) / 61);
        if ((payload[pos] ^ 0xffffffff) == -1) {
            pos++;
            return null;
        }
        return readString(2);
    }

    final byte method452(int i) {
        if (i != -16933672) {
            aClass16_2168 = null;
        }
        anInt2160++;
        return payload[pos++];
    }

    final int method453(int i) {
        if (i != 65280) {
            putInt(38, -4);
        }
        anInt2174++;
        pos += 2;
        return (payload[-2 + pos] & 0xff) + (payload[pos + -1] << 8 & 0xff00);
    }

    final void putLong2(long l, int i) {
        anInt2175++;
        putInt2((int) (l >> 32), (byte) -67);
        putInt2((int) l, (byte) -67);
        if (i != 1650435232) {
            aClass16_2169 = null;
        }
    }

    public static void method455(int i) {
        aClass16_2168 = null;
        aClass34_2132 = null;
        aClass16_2169 = null;
        int i_20_ = -44 / ((i - -5) / 61);
        aClass16_2163 = null;
    }

    final int method456(int i) {
        anInt2135++;
        pos += i;
        int i_21_ = ((0xff & payload[pos - 1]) << 8) + (0xff & payload[-2 + pos] - 128);
        if (i_21_ > 32767) {
            i_21_ -= 65536;
        }
        return i_21_;
    }

    final void putTriByte(int i, int i_22_) {
        anInt2144++;
        payload[pos++] = (byte) (i_22_ >> 16);
        payload[pos++] = (byte) (i_22_ >> 8);
        if (i == -483923896) {
            payload[pos++] = (byte) i_22_;
        }
    }

    final int method458(int i) {
        anInt2155++;
        if (i <= 123) {
            readUByte();
        }
        return 0xff & -payload[pos++] + 128;
    }

    final int method459(boolean bool) {
        int i = payload[pos] & 0xff;
        anInt2156++;
        if (bool != true) {
            return 56;
        }
        if (i < 128) {
            return readUByte() - 64;
        }
        return getUShortBE() - 49152;
    }

    final void writeByte(int i) {
        anInt2188++;
        payload[pos++] = (byte) i;
    }

    final int readUByte() {
        anInt2153++;
        return payload[pos++] & 0xff;
    }

    final void encrypt(int i, BigInteger key, BigInteger modulus) {
        anInt2165++;
        int i_24_ = pos;
        pos = 0;
        byte[] bs = new byte[i_24_];
        readBytes(bs, 0, i_24_);
        BigInteger biginteger_25_ = new BigInteger(bs);
        BigInteger biginteger_26_ = biginteger_25_.modPow(key, modulus);
        byte[] bs_27_ = biginteger_26_.toByteArray();
        if (i <= 116) {
            pos = 14;
        }
        pos = 0;
        writeByte(bs_27_.length);
        method438(0, 85, bs_27_, bs_27_.length);
    }

    final void putShortA(int i, int i_28_) {
        payload[pos++] = (byte) (i_28_ >> 8);
        payload[pos++] = (byte) (128 + i_28_);
        anInt2172++;
        int i_29_ = -63 % ((14 - i) / 45);
    }

    final void readBytesNegativeOffset(byte[] data, int offset, int length) {
        anInt2184++;
        for (int i = offset; i < length + offset; i++)
            data[i] = (byte) (payload[pos++] - 128);
    }

    final int method465(byte b) {
        if (b > -116) {
            putTriByte(36, -16);
        }
        pos += 4;
        anInt2190++;
        return (0xff & payload[-2 + pos]) + ((0xff0000 & payload[-4 + pos] << 16) + ((0xff & payload[-3 + pos]) << 24)) + (0xff00 & payload[-1 + pos] << 8);
    }

    final void method466(int i, int i_33_) {
        payload[-4 + (-i + pos)] = (byte) (i >> 24);
        payload[pos + (-i + -3)] = (byte) (i >> 16);
        if (i_33_ == 255) {
            anInt2145++;
            payload[pos - i + -2] = (byte) (i >> 8);
            payload[-1 + -i + pos] = (byte) i;
        }
    }

    final void method467(int i, int i_34_) {
        if (i_34_ != 15549) {
            payload = null;
        }
        anInt2146++;
        if (i >= 0 && i < 128) {
            writeByte(i);
        } else if (i >= 0 && (i ^ 0xffffffff) > -32769) {
            putShort(i + 32768, (byte) 51);
        } else {
            throw new IllegalArgumentException();
        }
    }

    final long readLong(int i) {
        if (i >= -88) {
            method469(16, -128, (byte) 28, null);
        }
        long l = 0xffffffffL & (long) readUIntBE();
        anInt2128++;
        long l_35_ = (long) readUIntBE() & 0xffffffffL;
        return l_35_ + (l << 32);
    }

    final void method469(int i, int i_36_, byte b, int[] is) {
        anInt2138++;
        int i_37_ = pos;
        if (b != 75) {
            anInt2166 = -93;
        }
        int i_38_ = (i_36_ - i) / 8;
        pos = i;
        for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff); i_39_++) {
            int i_40_ = -957401312;
            int i_41_ = -1640531527;
            int i_42_ = readUIntBE();
            int i_43_ = readUIntBE();
            int i_44_ = 32;
            while ((i_44_-- ^ 0xffffffff) < -1) {
                i_43_ -= is[(i_40_ & 0x19cf) >>> 11] + i_40_ ^ (i_42_ << 4 ^ i_42_ >>> 5) - -i_42_;
                i_40_ -= i_41_;
                i_42_ -= is[0x3 & i_40_] + i_40_ ^ i_43_ + (i_43_ << 4 ^ i_43_ >>> 5);
            }
            pos -= 8;
            putInt(i_42_, -1137894376);
            putInt(i_43_, -1137894376);
        }
        pos = i_37_;
    }

    static final void method470(byte b, Buffer class23_sub5) {
        anInt2133++;
        byte[] bs = new byte[24];
        if (Class23_Sub7.aClass29_2196 != null) {
            try {
                Class23_Sub7.aClass29_2196.method948(0L, -11320);
                Class23_Sub7.aClass29_2196.method950(bs, 105);
                int i;
                for (i = 0; i < 24; i++) {
                    if (bs[i] != 0) {
                        break;
                    }
                }
                if (i >= 24) {
                    throw new IOException();
                }
            } catch (Exception exception) {
                for (int i = 0; i < 24; i++)
                    bs[i] = (byte) -1;
            }
        }
        int i = 43 / ((-36 - b) / 58);
        class23_sub5.method438(0, 101, bs, 24);
    }

    final int getTriByte(int i) {
        anInt2192++;
        if (i < 50) {
            method440(61);
        }
        pos += 3;
        return (payload[-2 + pos] << 8 & 0xff00) + ((0xff & payload[-3 + pos]) << 16) - -(0xff & payload[-1 + pos]);
    }

    final int readUIntBE() {
        anInt2164++;
        pos += 4;
        return (~0xffffff & payload[-4 + pos] << 24) + ((payload[-3 + pos] << 16 & 0xff0000) - -((payload[pos - 2] & 0xff) << 8) - -(0xff & payload[-1 + pos]));
    }
                      //Dosnt the math happenand then tk unsigned
    final int getUByte(int i) {
        anInt2187++;
        if (i >= -98) {
            aBoolean2159 = false;
        }
        return 0xff & -payload[pos++];
    }

    final int method474(boolean bool) {
        anInt2191++;
        pos += 2;
        int i = ((payload[-2 + pos] & 0xff) << 8) + (payload[pos + -1] & 0xff);
        if ((i ^ 0xffffffff) < -32768) {
            i -= 65536;
        }
        if (bool != true) {
            getSmarts((byte) 112);
        }
        return i;
    }

    final int getMETriByte(boolean bool) {
        anInt2173++;
        if (bool != true) {
            aClass34_2132 = null;
        }
        pos += 3;
        return (payload[pos - 2] & 0xff) + (((0xff & payload[pos - 3]) << 16) + (0xff00 & payload[-1 + pos] << 8));
    }

    final int getUShortBE() {
        pos += 2;
        anInt2178++;
        return (0xff & payload[pos - 1]) + (payload[-2 + pos] << 8 & 0xff00);
    }

    final void method477(byte b, int i) {
        if (b != 21) {
            aClass16_2169 = null;
        }
        payload[-i + pos + -1] = (byte) i;
        anInt2130++;
    }

    final void method478(int i, int i_46_, int i_47_, byte[] bs) {
        anInt2183++;
        for (int i_48_ = i + i_46_ - -i_47_; i_46_ <= i_48_; i_48_--)
            bs[i_48_] = (byte) (-128 + payload[pos++]);
    }

    final void method479(int i, int i_49_) {
        if ((i & ~0x7f ^ 0xffffffff) != -1) {
            if ((i & ~0x3fff ^ 0xffffffff) != -1) {
                if ((~0x1fffff & i ^ 0xffffffff) != -1) {
                    if ((i & ~0xfffffff) != 0) {
                        writeByte(i >>> 28 | 0x80);
                    }
                    writeByte(0x80 | i >>> 21);
                }
                writeByte((0x201f5b | i) >>> 14);
            }
            writeByte(0x80 | i >>> 7);
        }
        anInt2148++;
        if (i_49_ != 128) {
            method483(78);
        }
        writeByte(i & 0x7f);
    }

    final int method480(byte b) {
        anInt2181++;
        pos += 2;
        if (b != 82) {
            aClass16_2168 = null;
        }
        return (payload[pos - 2] << 8 & 0xff00) + (-128 + payload[-1 + pos] & 0xff);
    }

    final void putInt2(int i, byte b) {
        if (b == -67) {
            payload[pos++] = (byte) (i >> 16);
            anInt2150++;
            payload[pos++] = (byte) (i >> 24);
            payload[pos++] = (byte) i;
            payload[pos++] = (byte) (i >> 8);
        }
    }

    final void putA(byte b, int i) {
        anInt2139++;
        payload[pos++] = (byte) (128 + i);
        int i_50_ = 30 % ((b - 7) / 47);
    }

    Buffer(int i) {
        payload = Class91.method1449((byte) -120, i);
        pos = 0;
    }

    Buffer(byte[] bs) {
        pos = 0;
        payload = bs;
    }

    final int method483(int i) {
        anInt2182++;
        if (i < 23) {
            payload = null;
        }
        pos += 4;
        return (payload[-3 + pos] & 0xff) + ((payload[pos + -4] & 0xff) << 8) + (((payload[pos + -2] & 0xff) << 24) + (payload[pos - 1] << 16 & 0xff0000));
    }

    static {
        aBoolean2159 = false;
        aClass16_2168 = Class38_Sub6.method1076((byte) 86, "Could not complete login)3");
        aClass16_2163 = aClass16_2168;
        anInt2166 = 0;
    }
}
