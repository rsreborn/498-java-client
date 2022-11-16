/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3
{
	static final void method53(int[] is, int i, int i_0_, int i_1_) {
		i_0_ = i + i_0_ - 7;
		while (i < i_0_) {
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
		}
		i_0_ += 7;
		while (i < i_0_)
			is[i++] = i_1_;
	}
	
	static final void method54(int[] is, int i, int i_2_) {
		i_2_ = i + i_2_ - 7;
		while (i < i_2_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_2_ += 7;
		while (i < i_2_)
			is[i++] = 0;
	}
	
	static final void method55(int[] is, int i, int[] is_3_, int i_4_, int i_5_) {
		if (is == is_3_) {
			if (i == i_4_) {
				return;
			}
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					is_3_[i_4_--] = is[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			is_3_[i_4_++] = is[i++];
	}
	
	static final void method56(byte[] bs, int i, byte[] bs_6_, int i_7_, int i_8_) {
		if (bs == bs_6_) {
			if (i == i_7_) {
				return;
			}
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
					bs_6_[i_7_--] = bs[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					bs_6_[i_7_--] = bs[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
			bs_6_[i_7_++] = bs[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			bs_6_[i_7_++] = bs[i++];
	}
}
