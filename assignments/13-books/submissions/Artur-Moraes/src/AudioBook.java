// Subclasse que representa um audiolivro
class AudioBook extends Book {
    private double fileSizeInMB;
    private int playLengthInMinutes;
    private String narrator;

    // Construtor que inicializa atributos do audiolivro
    public AudioBook(String title, int year, String author, double fileSizeInMB, int playLengthInMinutes, String narrator) {
        super(title, year, author);
        this.fileSizeInMB = fileSizeInMB;
        this.playLengthInMinutes = playLengthInMinutes;
        this.narrator = narrator;
    }

    // Sobrescreve toString para incluir tamanho do arquivo, duração e narrador
    @Override
    public String toString() {
        return super.toString() + ", Tamanho do arquivo: " + fileSizeInMB + "MB, Duração: " + playLengthInMinutes + " min, Narrador: " + narrator;
    }
}