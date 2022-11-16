/* Class63_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class63_Sub1 extends Class63
{
	private ByteBuffer aByteBuffer2721;
	
	final byte[] method1210(int i) {
		byte[] bs = new byte[aByteBuffer2721.capacity()];
		aByteBuffer2721.position(i);
		aByteBuffer2721.get(bs);
		return bs;
	}
	
	Class63_Sub1() {
		/* empty */
	}
	
	final void method1207(byte[] bs, boolean bool) {
		if (bool == true) {
			aByteBuffer2721 = ByteBuffer.allocateDirect(bs.length);
			aByteBuffer2721.position(0);
			aByteBuffer2721.put(bs);
		}
	}
}
