package bitbox.baseconverter;

/**
 * Created by fusiled on 02/07/17.
 * @author fusiled <fusiled@gmail.com>
 *     Logic of the BaseConverter. Gets a base at construction time.
 *     A value can be set and the string of the number converted in that base can
 *     be obtained
 */
public class BaseLogic implements BaseLogicInterface {

    private static final long BASE_LOGIC_DEFAULT_VALUE=0L;

    private final int base;
    private long value;


    public BaseLogic(int base)
    {
        this.base=base;
        this.value=BASE_LOGIC_DEFAULT_VALUE;
    }


    public int getBase() { return this.base;}

    public Long getValue() { return this.value;}

    public void setValue( Long newValue) { this.value=newValue;}

    public String getStringValueConverted() {
        return Long.toUnsignedString(this.value,this.base);
    }
}
