public class StaticList {
    private int[] data;
    private int size;   

    public StaticList(int size) {
        this.data = new int[size];
        this.size = 0;
    }

    public void clear() {
        this.size = 0;
    }

    public void add(int data) {
        if (!isFull()) {
            this.data[size] = data;
            size++;
        } else {
            System.out.println("Lista cheia, não é possível adicionar.");
        }
    }

    public void add(int data, int pos) {
        if (!isFull() && pos >= 0 && pos <= size) {
            for (int i = size; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = data;
            size++;
        } else {
            System.out.println("Posição inválida ou lista cheia.");
        }
    }

    public int remove(int pos) {
        if (pos >= 0 && pos < size) {
            int removedData = this.data[pos];
            for (int i = pos; i < size - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            size--;
            return removedData;
        } else {
            System.out.println("Posição inválida.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void setData(int data, int pos) {
        if (pos >= 0 && pos < size) {
            this.data[pos] = data;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public int getSize() {
        return size;
    }

    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
}