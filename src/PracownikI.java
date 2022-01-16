public interface PracownikI extends CzlowiekI{
    double wyplata(double wynagrodzenie, int nadgodziny);
    double premia(int nadgodziny);
    int lataDoEmerytury(int stazPracy);
}
