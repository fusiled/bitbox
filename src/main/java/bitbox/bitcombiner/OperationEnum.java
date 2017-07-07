package bitbox.bitcombiner;

/**
 * Created by fusiled on 28/06/17.
 * @author fusiled <fusiled@gmail.com>
 *
 * Enum with all the operation allowed in OperationField JCOmboBoxes
 */
public enum OperationEnum {

    SUM("+"),
    SUB("-"),
    DIV("/"),
    MUL("*"),
    REM("%"),
    RSHIFT(">>"),
    LSHIFT("<<"),
    GREAT(">"),
    LESS("<"),
    GEQ(">="),
    LEQ("<="),
    DIFFERENT("!="),
    EQUAL("=="),
    XORB("^"),
    ANDB("&"),
    ORB("|"),
    ANDL("&&"),
    ORL_TOKEN("||");


    String visual_rep;
    OperationEnum(String visual_rep)
    {
        this.visual_rep=visual_rep;
    }

    @Override
    public String toString()
    {
        return this.visual_rep;
    }
}
