/* Class6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class6_Sub1 extends Class6
{
	private int anInt1980;
	private static Interface3 anInterface3_1981;
	
	final int method80() {
		return anInterface3_1981.method13(anInt1980, -119);
	}
	
	final void method83() {
		anInterface3_1981.method11(anInt1980, false);
	}
	
	Class6_Sub1(Class9 class9, int i) {
		anInterface3_1981 = class9.method108(true);
		anInt1980 = i;
	}
	
	final void method82() {
		anInterface3_1981.method14(anInt1980, 70);
	}
	
	public static void method88() {
		anInterface3_1981 = null;
	}
	
	final void method79() {
		anInterface3_1981.method12(anInt1980, anIntArray132);
	}
	
	final void method86(int i) throws Exception {
		if (i > 32768) {
			throw new IllegalArgumentException();
		}
		anInterface3_1981.method9(i, anInt1980, 37);
	}
	
	final void method81(Component component) throws Exception {
		anInterface3_1981.method10(Class13.aBoolean257, component, Class32.anInt498, (byte) -113);
	}
}
