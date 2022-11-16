/* Class78_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class78_Sub1 extends Class78
{
	private Component aComponent2749;
	
	final void method1346(Component component, int i, int i_0_, int i_1_) {
		anInt1413 = i;
		anIntArray1416 = new int[i_0_ * i - -1];
		anInt1415 = i_0_;
		if (i_1_ != 0) {
			aComponent2749 = null;
		}
		DataBufferInt databufferint = new DataBufferInt(anIntArray1416, anIntArray1416.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(anInt1415, anInt1413), databufferint, null);
		anImage1414 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		aComponent2749 = component;
		method1347((byte) -80);
	}
	
	final void method1345(int i, int i_2_, byte b, int i_3_, Graphics graphics, int i_4_) {
		Shape shape = graphics.getClip();
		graphics.clipRect(i_2_, i_3_, i, i_4_);
		graphics.drawImage(anImage1414, 0, 0, aComponent2749);
		if (b < 89) {
			method1342(16, null, 33, -65);
		}
		graphics.setClip(shape);
	}
	
	final void method1342(int i, Graphics graphics, int i_5_, int i_6_) {
		if (i != 3) {
			aComponent2749 = null;
		}
		graphics.drawImage(anImage1414, i_6_, i_5_, aComponent2749);
	}
}
