class NoteBook {

    private int ssdStorage;
    private int ram;
    private String osName;
    private String color;
    private String processor;

    private NoteBook(int ssdStorage, int ram, String osName, String color, String processor) {
        this.ssdStorage = ssdStorage;
        this.ram = ram;
        this.osName = osName;
        this.color = color;
        this.processor = processor;
    }

    public int getSsdStorage() {
        return ssdStorage;
    }

    public int getRam() {
        return ram;
    }

    public String getOsName() {
        return osName;
    }

    public String getColor() {
        return color;
    }

    public String getProcessor() {
        return processor;
    }

    static class NoteBookBuilder {
        private int ssdStorage = 256;
        private int ram = 8;
        private String osName = "DOS";
        private String color = "Black";
        private String processor = "Intel i7";

        public NoteBookBuilder setSsdStorage(int ssdStorage) {
            this.ssdStorage = ssdStorage;
            return this;
        }

        public NoteBookBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public NoteBookBuilder setOsName(String osName) {
            this.osName = osName;
            return this;
        }

        public NoteBookBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public NoteBookBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public NoteBook build() {
            return new NoteBook(ssdStorage, ram, osName, color, processor);
        }
    }

    @Override
    public String toString(){
        return String.format("NoteBook: %s(OS), %s(Proc), %s(RAM), %s(SSD), %s(Color)", osName, processor, ram, ssdStorage, color);
    }
}