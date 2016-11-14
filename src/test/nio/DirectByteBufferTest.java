package nio;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import sun.nio.ch.DirectBuffer;
import java.nio.ByteBuffer;

/**
 * Created by Meifans on 2016/11/14.
 */
@Slf4j
public class DirectByteBufferTest {


	@Test
	public void testClean() throws InterruptedException {

		ByteBuffer directBuffer = ByteBuffer.allocateDirect(1024 * 1024*6);
		log.info("倒数5秒");
		Thread.sleep(1000*5);
		log.info("清理");
		if (directBuffer.isDirect()) {
			((DirectBuffer)directBuffer).cleaner().clean();
		}
	}


}
