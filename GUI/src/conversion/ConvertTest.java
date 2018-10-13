package conversion;

import java.io.IOException;
import java.util.Arrays;

public class ConvertTest {

	public static void main(String[] args) throws IOException {
		Converter mConverter = new Converter();
		
		// Test file paths
		String inWZ = "C:\\Users\\Wen\\Desktop\\Audio Track.wav";
		String outWZ = "C:\\Users\\Wen\\Desktop\\output.wav";
		
		// Set the file paths
		String inputFile = inWZ;
		String outputFile = outWZ;
		
		byte[] tobytes = mConverter.WavToByte(inputFile);
		int[] toint = mConverter.ByteToInt(tobytes);
		
		/* 
		  for(int i = 0; i < toint.length - 100 && i < 100000; i += 100) {
		 
			System.out.println(Arrays.toString(toint).substring(i, i + 100));
		}
		*/
		
		mConverter.writeToWavFile(toint, outputFile);
		System.out.println("done");
	}

}
