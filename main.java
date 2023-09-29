import java.util.ArrayList;
import java.util.Arrays;

import asd.block;
public class main{

    ArrayList<block> blockchain=new ArrayList<>();
    public static void main(String[]args){

        String[] genesis_Transactions={"Tefo started the chain"};
        block genesis_Block=new block(0, genesis_Transactions);
        
        String[] block2Transactions={"Tefo sent someone 10 dollars"};
        block block2=new block(genesis_Block.getBlockHash(),block2Transactions);
        
        String[] block3Transactions={"someone sent 10 dollars to Tefo"};
        block block3=new block(block2.getBlockHash(),block3Transactions);

        System.out.println("hash of genesis block");
        System.out.println(genesis_Block.getBlockHash());

        System.out.println("hash of block2");
        System.out.println(block2.getBlockHash());

        System.out.println("hash of block3");
        System.out.println(block3.getBlockHash());
    }
}