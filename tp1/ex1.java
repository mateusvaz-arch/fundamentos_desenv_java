public class InfoAmbiente {
    public static void main(String[] args) {
		String osName = System.getProperty("os.name");
        System.out.println("Sistema Operacional: " + osName);

        String javaVersion = System.getProperty("java.version");
        System.out.println("Versão do Java: " + javaVersion);
        String userDir = System.getProperty("user.dir");
        System.out.println("Diretório de Trabalho: " + userDir);
    }
}
