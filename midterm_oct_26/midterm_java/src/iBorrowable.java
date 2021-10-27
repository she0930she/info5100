public interface iBorrowable {
    void setBorrowDay(int day);
    void setReturnDay(int day);
    boolean isAvailable(int day);

}
