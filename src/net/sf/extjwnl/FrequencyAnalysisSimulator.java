/*
NC JUP 34 OPTGB BNCVP JUP G.F.B. JNJTCNV XTB ZNBVAIPGPZ AC JUP BPTMSAAG BADJU AM CPXMADCZSTCZ, NJ UTB LPVAFP JUP XAGSZ'B FABJ MTFADB BUNQXGPVE -- T GDBJNCR UDSE TBBTNSPZ LO UDCZGPZB AM PYQSAGPGB TCZ FAINPFTEPGB, BTSIAGB TCZ JADGNBJB, BVNPCJNBJB TCZ MPZPGTS XTJVUZARB. TSS TRGPP JUTJ JUP ACVP-RGTCZ BUNQ NB GTQNZSO MTSSNCR TQTGJ. GPBJNCR AC JUP NVO CAGJU TJSTCJNV BPTLPZ FAGP JUTC JXA FNSPB ZAXC, DQGNRUJ LDJ BQSNJ NC JXA, JUP MGTRNSP FTBB NB BSAXSO BDVVDFLNCR JA GDBJ, VAGGABNIP BTSJB, FNVGALPB TCZ VASACNPB AM ZPPQ-BPT VGPTJDGPB.
*/

/*
In the 34 years since the R.M.S. Titanic was discovered on the seafloor south of Newfoundland, it has become the world�s most famous shipwreck � a rusting hulk assailed by hundreds of explorers and moviemakers, salvors and tourists, scientists and federal watchdogs. All agree that the once-grand ship is rapidly falling apart. Resting on the icy North Atlantic seabed more than two miles down, upright but split in two, the fragile mass is slowly succumbing to rust, corrosive salts, microbes and colonies of deep-sea creatures.
*/

/*
in the 34 yeaGs since the G.m.s. titanic was discoIeGed on the searlooG soDth or newroDndland, it has become the woGld's most ramoDs shipwGecu -- a GDstinR hDlu assailed by hDndGeds or eYploGeGs and moIiemaueGs, salIoGs and toDGists, scientists and redeGal watchdoRs. all aRGee that the once-RGand ship is Gapidly rallinR apaGt. GestinR on the icy noGth atlantic seabed moGe than two miles down, DpGiRht bDt split in two, the rGaRile mass is slowly sDccDmbinR to GDst, coGGosiIe salts, micGobes and colonies or deep-sea cGeatDGes.
*/

package net.sf.extjwnl; // Uses the extjwnl package to determine if strings are sentences

import java.util.Scanner;

// Import secretwriting needed classes
import secretwriting.CaesarShiftCipher;
import secretwriting.MonoalphabeticCipher;
import secretwriting.VigenereCipher;

/**
 * Frequency Analysis Simulator
 * By Varun Singh
 */

/**
 * <h1>Frequency Analysis Simulator</h1>
 * <p>Frequency Analysis Simulator is a Java program that simulates frequency analysis in which the user inputs cipher text into the console and the System outputs as close to the corresponding plain text as possible. If the type of cipher has been identified, the process may be sped up after the user inputs the type of cipher (monoalphabetic or Vigenere) on prompt. Furthermore, Frequency Analysis Simulator can decipher the caesar shift cipher, a cipher that does not involve the use of frequency analysis for decipherment. As another added bonus, the application is able to encrypt messages.</p>
 * @author Varun Singh
 * @inspiration The Code Book by Simon Singh
 */
public class FrequencyAnalysisSimulator {
	
	static Scanner userInput = new Scanner (System.in);
	static enum ACTION {
		ENCRYPT,
		DECRYPT,
		MAGIC
	}

	static Exception InvalidInputException = new Exception("You did not enter valid input. Please rerun the program and try again");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws JWNLException {
		long startTime = System.currentTimeMillis();
		ACTION action = ACTION.MAGIC;
		if (action.equals(ACTION.DECRYPT))
			handleDecrypt();
		else if (action.equals(ACTION.ENCRYPT))
			handleEncrypt();
		else if (action.equals(ACTION.MAGIC)) {
			MonoalphabeticCipher c = new MonoalphabeticCipher("TQSORPID ICIDM GQGISZ, ORSTI ZJI PEBS QY BQGES, BJIS E YIGEKI EOURDIP XNZ ZQ SQ ECERK. OJI EOWIP ZQ EZZISP OTJQQK XNZ BEO PISRIP. OJI DEROIP JID JESP XNZ BEOS�Z TEKKIP QS. OJI EUUKRIP XNZ BEOS�Z JRDIP. OJI ISKROZIP XNZ BEOS�Z PIUKQMIP. OJI TDIEZIP XNZ BEOS�Z TDIPRZIP. OJI DES XNZ BEOS�Z IKITZIP. RGELRSI ZJI OEPSIOO ESP YDNOZDEZRQS QY ICIDM ONTJ RSOZESTI EO E OUEDW, ZJIRD TQGXRSIP ISIDLM ZJI ORAI QY GESM ONSO. ZJEZ RO ZJI GIEONDI QY LDRIY ESP YNDM R YIKZ DROI RSORPI GI EO R BEZTJIP IKRAEXIZJ BEDDIS�O XRP YQD ZJI PIGQTDEZRT SQGRSEZRQS BESI. BJIS JRKKEDM TKRSZQS KQOZ RS 2016, RZ JNDZ RS ORGRKED BEMO XNZ PRPS�Z ONDUDROI GI. QNZ JIDI RS ZJI DIP JRSZIDKESPO, RZ BEO UKERS ZQ OQGI QY NO ZJEZ TISZDROZ RPIEO PRP SQZ IFTRZI RS ZRGIO QY JROZQDRT RSIHNEKRZM. ZJRO IKITZRQS, ZJQNLJ, R ZJQNLJZ IKRAEXIZJ BEDDIS - E TKEOO DICQKNZRQSEDM ZQ GEZTJ ZJI GQGISZ - GRLJZ LQ ZQ ZJI BJRZI JQNOI. RZ ZNDSO QNZ ZJEZ OJI BQS�Z ICIS LQ ZQ ZJI LISIDEK IKITZRQS. SQB ZJI OEGI UNSPRZO BJQ RS 2016 UDQCIP ZJIM WSQB CIDM KRZZKI BRKK KROZ ZJI DIEOQSO, BRZJQNZ DIEKRARSL ZJIM�DI EGQSL ZJI DIEOQSO.");
			System.out.println(c.length());
			System.out.println(c.decrypt());
		}
	    long endTime = System.currentTimeMillis();
	    System.out.println("\n\nIt took " + (endTime - startTime) + " milliseconds");
	}

	/**
	 * @return whether to encrypt or decipher
	 */
	public static ACTION determineAction() {
		System.out.println("Would you like to encrypt or decrypt?");
		String myString = userInput.nextLine();
		ACTION determinedAction;
		try {
			determinedAction = ACTION.valueOf(myString.toUpperCase());
		} catch (IllegalArgumentException e) {
			System.out.println("That is not a valid response. You must enter encrypt, decrypt, or magic.");
			determinedAction = ACTION.ENCRYPT;
			System.exit(1);
		}
		
		return determinedAction;
	}
	
	/** Obtain the cipher type from the user
	 * @param action the action that the user chose to take
	 * @return the type of substitution cipher
	 */
	public static String determineCipherType(ACTION action) {
		// DONE Implement determineCipherType()
		if (action.equals(ACTION.DECRYPT)) {
			System.out.println("If you know the type of cipher this ciphertext is, enter it now. Otherwise, enter a new line.");
		} else if (action.equals(ACTION.ENCRYPT)) {
			System.out.println("What type of cipher would you like to use to encrypt the message? (Caesar shift, monoalphabetic, Vigenere");
		}
		
		String cipherType = userInput.nextLine();
		return cipherType;
	}
	
	/** 
	 * @return the cipher text that the user inputs as a string
	 */
	public static String determineCiphertext() {
		// DONE Implement determineCiphertext() method 
		System.out.println("Enter a ciphertext: ");
		String ciphertext = userInput.nextLine();
		return ciphertext;
		
	}
	
	/** Obtain the plain text message from the user 
	 * @return
	 */
	public static String determinePlaintext() {
		// DONE determinePlaintext() method
		System.out.print("Enter a plaintext: ");
		String plaintext = userInput.nextLine();
		return plaintext;
	}
	
	/** Handles all the methods, tasks, and processes if the user chooses to decipher a message
	 * @throws JWNLException
	 */
	protected static void handleDecrypt() throws JWNLException {
		String ciphertext = determineCiphertext();
		String ciphertype = determineCipherType(ACTION.DECRYPT);
		if (ciphertype.equalsIgnoreCase("Caesar shift")) {
			System.out.println(new CaesarShiftCipher(ciphertext).decrypt());
		} else if (ciphertype.equals("monoalphabetic")) {
			System.out.println(new MonoalphabeticCipher(ciphertext).decrypt());
		} else if (ciphertype.equals("Vigenere")) {
			System.out.println(new VigenereCipher(ciphertext).decrypt());
		}
	}
	
	/** Handles all the methods, tasks, and processes if the user chooses to encrypt a message
	 * 
	 */
	protected static void handleEncrypt() {
		String plaintext = determinePlaintext();
		String ciphertype = determineCipherType(ACTION.ENCRYPT);
		if (ciphertype.equalsIgnoreCase("Caesar shift")) {
			System.out.println(new CaesarShiftCipher(plaintext).encrypt());
		} else if (ciphertype.equalsIgnoreCase("monoalphabetic")) {
			System.out.println(new MonoalphabeticCipher(plaintext).encrypt());
		} else if (ciphertype.equalsIgnoreCase("Vigenere")) {
			System.out.println(new VigenereCipher(plaintext).encrypt());
		}
	}
}	
