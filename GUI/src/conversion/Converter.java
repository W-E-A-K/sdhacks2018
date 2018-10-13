package conversion;

import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Converter {
	byte[] header = new byte[44];

	public Converter() {
		
	}
	
	/*
	 * Reads a .wav file into an array of bytes
	 * @param url = filepath of .wav file
	 * @return = byte[] of read bytes
	 */
	public byte[] WavToByte(String url) throws IOException {
		File infile = new File(url);
		byte[] txt = new byte[(int) infile.length()];
		AudioInputStream instream;
		
		// Reads in .wav file and converts sample data into bytes
		try {
			instream = AudioSystem.getAudioInputStream(infile);
			instream.read(txt);
			instream.close();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Reads in .wav header bytes
		FileInputStream is = new FileInputStream(infile);
		is.read(header);
			
		return txt;
	}
	
	/*
	 * Reads byte[] into int[]
	 * 
	 * @param bytes = byte[] to be converted to int[]
	 * @return = int[] of converted bytes
	 */
	public int[] ByteToInt(byte[] bytes) {
		int[] ints = new int[bytes.length/2];
		for(int i = 0; i < ints.length; i++) {
			ints[i] = ((bytes[i*2] & 0xff) << 8) | (bytes[i*2 + 1] & 0xff);
		}
		
		return ints;
	}
	
	/*
	 * Writes int[] to wav file
	 * 
	 * @param ints = int[] to be converted to .wav file
	 * @param outputFile = String file path to be written to
	 */
	public void writeToWavFile(int[] ints, String outputFile) throws IOException {
		byte[] bytes = new byte[ints.length * 2];
		for(int i = 0; i < ints.length; i++) {
			bytes[i*2] = (byte) (ints[i] & 0xFF);
			bytes[i*2 + 1] = (byte) ((ints[i] >> 8) & 0xFF);
		}
		
		byte[] filebytes = new byte[header.length + bytes.length];
		for(int i = 0; i < header.length; i++) {
			filebytes[i] = header[i];
		}
		for(int i = 0; i < bytes.length; i++) {
			filebytes[i + header.length] = bytes[i];
		}
		
		InputStream byteArray = new ByteArrayInputStream(filebytes);
		AudioInputStream instream;
		try {
			instream = AudioSystem.getAudioInputStream(byteArray);
			File output = new File(outputFile);
			AudioSystem.write(instream, Type.WAVE, output);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}

		
	}
}
