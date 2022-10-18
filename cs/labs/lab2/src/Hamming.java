package HammingDecoder;

import java.util.ArrayList;

public class Hamming{
	
	private int encodedLength;
	private int decodedLength;
	
	public class HammingDecoded{
		public int error;
		public String msg="";
	}


	public Hamming(){
       		encodedLength = 7;
	        decodedLength = 4;
	}

	public Hamming(int encoded, int decoded){
		encodedLength = encoded;
		decodedLength = decoded;
	}
	

	HammingDecoded decode(int[] msg){
		int blockSize = 1;
		int error = 0;
		while (blockSize <= encodedLength){
			int s = 0;
			for(int i = blockSize - 1;i < encodedLength; i += blockSize * 2){
				for(int j = i; j < i + blockSize; j++)
					s^=msg[j];
			}
			error += s*blockSize;
			blockSize *= 2;
		}
		if(error != 0)
			msg[error - 1] ^= 1;
		
		HammingDecoded result = new HammingDecoded();
		result.error = error;
		int pow2 = 1;
		for(int i = 0;i < encodedLength;i++){
			if(pow2 == i + 1){
				pow2 *= 2;
				continue;
			}
			result.msg += String.format("%d",msg[i]);
		}
		return result;
	}
	
	HammingDecoded decode(String msg){
		int[] convertedMsg = new int[encodedLength];
		for(int i=0;i<encodedLength;i++)
			convertedMsg[i]= ((int)msg.charAt(i)) - 48;
	        return decode(convertedMsg);
	}
}
