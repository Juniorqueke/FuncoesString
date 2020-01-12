package oOP;

public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01  = original.toLowerCase();
		//FUN��O QUE CONVERTE TODO O TEXTO DA VARIAVEL ORIGINAL EM LETRA MINUSCULA
		String s02 = original.toUpperCase();
		//FUN��O QUE CONVERTE TODO O TEXTO DA VARIAVEL ORIGINAL EM LETRA MAISCULA
		String s03 = original.trim();
		//FUN��O QUE ELIMINA OS ESPA�OS DA VARIAVEL ORIGINAL	
		String s04 = original.substring(2);
		//FUN��O QUE PEGA O SEGUNDO CARACTER DA VARIAVEL ORIGINAL NO CASO A LETRA C EM DIANTE
		String s05 = original.substring(2, 9);
		//FUN��O QUE RECORTA O CONTEUDO DA VARIAVEL ORIGINAL, IR� RECORTAR DA LETRA C AT� A LETRA H
		String s06 = original.replace('a', 'x');
		//FUN��O QUE FAZ A TROCA DA LETRA a PELA LETRA x
		String s07 = original.replace("abc", "xy");
		//FUN��O QUE TROCA AS LETRAS abc por xy
		int i = original.indexOf("bc");
		//MOSTRA EM QUAL POSI��O EST�O AS LETRAS bc
		int j = original.lastIndexOf("bc");
		//MOSTRA EM QUAL POSI��O EST�O AS �LTIMAS LETRAS bc

		
		System.out.println("Original: -"+original+ "-");
		System.out.println("toLowerCase: - "+s01+ "-");
		System.out.println("toUpperCase: -"+ s02+ "-");
		System.out.println("trim: -"+s03 + "-");
		System.out.println("substring(2) -"+s04 + "-");
		System.out.println("substring(2, 9): -"+s05  + "-");
		System.out.println("Replace('a', ''x): -"+ s06 + "-");
		System.out.println("Replace('abc', ''xy): -"+ s07 + "-");
		System.out.println("Index of 'bc': "+i);
		System.out.println("Last index of 'bc': "+j);




		
	}
	 	
}
