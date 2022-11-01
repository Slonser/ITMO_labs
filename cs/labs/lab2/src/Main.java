package HammingDecoder;
import HammingDecoder.Hamming; 


public class Main{
	public static void main(String[] args) throws Exception{
		if(args.length == 0)
			throw new Exception("Передайте закодированное сообщение аргументом коммандной строки.");

		Hamming hamming = new Hamming();
		var result = hamming.decode(args[0]);
	 	if(result.error != 0){
			System.out.printf("Найдена ошибка в бите номер %d%n",result.error);
		}
		System.out.printf("Переданное сообщение %s",result.msg);	
	}
}
