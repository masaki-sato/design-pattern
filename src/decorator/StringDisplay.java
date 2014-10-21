package decorator;

public class StringDisplay extends Display {

    // 表示文字列
    private String string;

    // 引数で表示文字列を指定
    protected StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColums() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
