public class Bishop extends ChessPiece {
    static boolean isBishopAttack = false;

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        } else if ((Math.abs(toLine - line) == Math.abs(toColumn - column) &&
                ((toLine - line) != 0) && (toColumn - column) != 0)) {
            isBishopAttack = true;
            return true;
        } else return false;
    }
}