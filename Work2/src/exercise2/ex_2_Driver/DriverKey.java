package exercise2.ex_2_Driver;

public class DriverKey {
    private final int KEY_LOCK;

    public DriverKey(int key_lock) {
        KEY_LOCK = key_lock;
    }

    public int getKeyLock() {
        return KEY_LOCK;
    }

    @Override
    public String toString() {
        if (KEY_LOCK > 0) {
            return "" +
                    KEY_LOCK;
        } else {
            return "Нет ключа";
        }
    }
}
