package facade;

public class ComputerFacade {

    private final CPU cpu_ = new CPU();
    private final Memory memory_ = new Memory();
    private final HardDrive hard_drive_ = new HardDrive();

    private long kBootAddress = 121;
    private long kBootSector = 9;

    private int kSectorSize = 512;

    public void Start() {
        cpu_.Freeze();
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }
}
