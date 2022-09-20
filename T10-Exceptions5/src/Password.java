
public class Password {

	private int longitud = 8;
	private String password = "";


	public Password() {
		super();
	}


	public Password(int longitud) {
		super();
		this.longitud = longitud;
	}


	public String generarPassword() {

		String digitos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		//61
		String[] arrayDigitos = digitos.split("");
		String password = "";

		for (int i = 0; i < longitud; i++) {

			double numeroAleatorio = Math.random()*62;

			password += arrayDigitos[(int)numeroAleatorio];


		}

		return password;


	}



	public boolean esFuerte(String password) {

		int contadorMayus = 0;
		int contadorMinus = 0;
		int contadorNum = 0;
		
		for (int i = 0; i < password.length(); i++){

			if (password.charAt(i) >= 97 && password.charAt(i) <= 122){

				contadorMinus+=1;


			}

			else{

				if (password.charAt(i) >= 65 && password.charAt(i) <= 90){

					contadorMayus+=1;

				}

				else{
					contadorNum+=1;
				}
			}
		}

		if (contadorNum >= 5 && contadorMinus >= 1 && contadorMayus >= 2){

			return true;
		}

		else{
			return false;
		}
	}


	public int getLongitud() {
		return longitud;
	}


	public String getPassword() {
		return password;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}































	/*
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);

			if (array[i] == "A" || array[i] == "B"|| array[i] == "C"|| array[i] == "D"|| array[i] == "E"|| array[i] == "F"|| array[i] == "G"|| array[i] == "H" || array[i] == "I"|| array[i] == "J"|| array[i] == "K"|| array[i] == "L"|| array[i] == "M"|| array[i] == "N"|| array[i] == "O"|| array[i] == "P"|| array[i] == "R"|| array[i] == "S"|| array[i] == "T"|| array[i] == "U"|| array[i] == "V"|| array[i] == "W"|| array[i] == "X"|| array[i] == "Y"|| array[i] == "Z") {
				System.out.println("sjhieuygheuhiuhiuh");


				contadorMayus++;

				if (contadorMayus > 2) {
					masDosMayusculas = true;
				}


			}


			else if (array[i] == "a" || array[i] == "b"|| array[i] == "c"|| array[i] == "d"|| array[i] == "e"|| array[i] == "f"|| array[i] == "g"|| array[i] == "h" || array[i] == "i"|| array[i] == "j"|| array[i] == "k"|| array[i] == "l"|| array[i] == "m"|| array[i] == "n"|| array[i] == "o"|| array[i] == "p"|| array[i] == "r"|| array[i] == "s"|| array[i] == "t"|| array[i] == "u"|| array[i] == "v"|| array[i] == "w"|| array[i] == "x"|| array[i] == "y"|| array[i] == "z") {


				contadorMinus++;

				if (contadorMinus > 1) {
					masDosMayusculas = true;
				}



			}


			else if (array[i] == "1" || array[i] == "2" || array[i] == "3" || array[i] == "4" || array[i] == "5" || array[i] == "6"|| array[i] == "7" || array[i] == "8"|| array[i] == "9" || array[i] == "0") {
System.out.println(contadorNum);
				contadorNum++;
				if (contadorNum > 5) {
					masDosMayusculas = true;
				}
			}


		}

		if (masCincoNumeros == true && masDosMayusculas == true && masUnaMinuscula == true) {

			return true;
		}



		else {
		return false;
		}


	 */
}








