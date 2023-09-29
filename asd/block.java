package asd;
import java.util.Arrays;

public class block {
    private int previous_Hash;
    private String[] transactions;

    private int Block_Hash;

    public block(int previous_Hash,String[] transactions){
        this.previous_Hash=previous_Hash;
        this.transactions=transactions;

        Object[]contents={Arrays.hashCode(transactions),previous_Hash};
        this.Block_Hash=Arrays.hashCode(contents);
    }

    public int getprevious_Hash(){
        return previous_Hash;
    }
    public String[] gettransactions(){
        return transactions;
    }
    public int getBlockHash(){
        return Block_Hash;
    }
}
