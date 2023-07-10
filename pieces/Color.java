package pieces;

public enum Color {
    WHITE {
        public int getDirection() {
            return 1;
        }
    }, 
    BLACK {
        public int getDirection() {
            return -1;
        }
    };

    public abstract int getDirection();
}
