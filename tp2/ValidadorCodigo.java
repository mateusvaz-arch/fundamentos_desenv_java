public class ValidadorCodigo {

    public static String normalizarCodigo(String code) {
        if (code == null) {
            return "";
        }
        return code.trim().toUpperCase();
    }

    public static boolean codigoValido(String code) {
        if (code == null || code.length() != 7) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            char c = code.charAt(i);
            if (!Character.isLetter(c) || c < 'A' || c > 'Z') {
                return false;
            }
        }

        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean[] codigoValido(String[] codigos) {
        boolean[] resultados = new boolean[codigos.length];
        for (int i = 0; i < codigos.length; i++) {
            String normalizado = normalizarCodigo(codigos[i]);
            resultados[i] = codigoValido(normalizado);
        }
        return resultados;
    }

    public static void main(String[] args) {
        String[] testesIndividuais = {"ABC1234", "   abc1234   ", "A1C1234"};
        for (String teste : testesIndividuais) {
            String normalizado = normalizarCodigo(teste);
            boolean valido = codigoValido(normalizado);
            System.out.println("Original: \"" + teste + "\" -> Normalizado: \"" + normalizado + "\" -> Válido: " + valido);
        }

        System.out.println();

        String[] lote = {"LOG9876", "log9876", "ERR12", "123LOGS", "ABC4321"};
        boolean[] resultados = codigoValido(lote);
        for (int i = 0; i < lote.length; i++) {
            System.out.println("Lote: " + lote[i] + " -> Válido: " + resultados[i]);
        }
    }
}
