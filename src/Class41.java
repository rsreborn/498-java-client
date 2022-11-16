/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41
{
	protected int anInt633;
	private int anInt634 = 2;
	private int[] anIntArray635 = new int[2];
	protected int anInt636;
	private int[] anIntArray637 = new int[2];
	protected int anInt638;
	private int anInt639;
	private int anInt640;
	private int anInt641;
	private int anInt642;
	private int anInt643;
	
	final void method1109(Buffer class23_sub5) {
		anInt634 = class23_sub5.method461(-1797813752);
		anIntArray635 = new int[anInt634];
		anIntArray637 = new int[anInt634];
		for (int i = 0; i < anInt634; i++) {
			anIntArray635[i] = class23_sub5.method476((byte) -100);
			anIntArray637[i] = class23_sub5.method476((byte) -108);
		}
	}
	
	final void method1110() {
		anInt639 = 0;
		anInt643 = 0;
		anInt642 = 0;
		anInt640 = 0;
		anInt641 = 0;
	}
	
	final void method1111(Buffer class23_sub5) {
		anInt638 = class23_sub5.method461(-1797813752);
		anInt636 = class23_sub5.method472(115);
		anInt633 = class23_sub5.method472(-117);
		method1109(class23_sub5);
	}
	
	final int method1112(int i) {
		if (anInt641 >= anInt639) {
			anInt640 = anIntArray637[anInt643++] << 15;
			if (anInt643 >= anInt634) {
				anInt643 = anInt634 - 1;
			}
			anInt639 = (int) ((double) anIntArray635[anInt643] / 65536.0 * (double) i);
			if (anInt639 > anInt641) {
				anInt642 = ((anIntArray637[anInt643] << 15) - anInt640) / (anInt639 - anInt641);
			}
		}
		anInt640 += anInt642;
		anInt641++;
		return anInt640 - anInt642 >> 15;
	}
	
	public Class41() {
		anIntArray635[0] = 0;
		anIntArray635[1] = 65535;
		anIntArray637[0] = 0;
		anIntArray637[1] = 65535;
	}
}
