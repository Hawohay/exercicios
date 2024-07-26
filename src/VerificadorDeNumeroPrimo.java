public class VerificadorDeNumeroPrimo extends NumerosPrimos {

  // Implementação de um método de instância

  @Override
  public void verificarPrimalidade() {
    // Implementação para verificar primalidade
    // Se desejar, pode usar um método auxiliar estático aqui
  }

  // Método estático para verificar a primalidade de um número
  public static boolean verificarPrimalidade(int number) {
    if (number <= 1) {
      return false;
    }

    if (verificaSeDivisivelPor2(number) && number != 2) {
      return false;
    }

    if (verificaSeDivisivelPor3(number) && number != 3) {
      return false;
    }

    if (verificaSeDivisivelPor4(number) && number != 4) {
      return false;
    }

    if (verificaSeDivisivelPor5(number) && number != 5) {
      return false;
    }

    if (verificaSeDivisivelPor6(number) && number != 6) {
      return false;
    }

    if (verificaSeDivisivelPor7(number) && number != 7) {
      return false;
    }

    for (int i = 8; i * i <= number; i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  // Métodos estáticos para verificar se o número é divisível
  private static boolean verificaSeDivisivelPor2(int number) {
    return number % 2 == 0;
  }

  private static boolean verificaSeDivisivelPor3(int number) {
    int sumOfDigits = 0;
    int temp = number;

    while (temp != 0) {
      sumOfDigits += temp % 10;
      temp /= 10;
    }

    return sumOfDigits % 3 == 0;
  }

  private static boolean verificaSeDivisivelPor4(int number) {
    return number % 4 == 0;
  }

  private static boolean verificaSeDivisivelPor5(int number) {
    int lastDigit = number % 10;
    return lastDigit == 0 || lastDigit == 5;
  }

  private static boolean verificaSeDivisivelPor6(int number) {
    return verificaSeDivisivelPor2(number) && verificaSeDivisivelPor3(number);
  }

  private static boolean verificaSeDivisivelPor7(int number) {
    int lastDigit = number % 10;
    int remainingNumber = number / 10;
    int result = remainingNumber - 2 * lastDigit;

    return result % 7 == 0;
  }
}
