import java.util.ArrayList;
import java.util.Arrays;

import asd.block;
public class main{

    ArrayList<block> blockchain=new ArrayList<>();
    public static void main(String[]args){

        String[] genesis_Transactions={"tevfik started the chain"};
        
        block genesis_Block=new block(0, genesis_Transactions);
        
        System.out.println(genesis_Block.getBlockHash());
    }
}