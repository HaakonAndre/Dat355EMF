package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Character'", "'LongRest'", "'ShortRest'", "'Spell'", "'Attack'", "'Move'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHistory"
    // InternalMyDsl.g:53:1: entryRuleHistory : ruleHistory EOF ;
    public final void entryRuleHistory() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleHistory EOF )
            // InternalMyDsl.g:55:1: ruleHistory EOF
            {
             before(grammarAccess.getHistoryRule()); 
            pushFollow(FOLLOW_1);
            ruleHistory();

            state._fsp--;

             after(grammarAccess.getHistoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHistory"


    // $ANTLR start "ruleHistory"
    // InternalMyDsl.g:62:1: ruleHistory : ( ( rule__History__ActionlistAssignment )* ) ;
    public final void ruleHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__History__ActionlistAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__History__ActionlistAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__History__ActionlistAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__History__ActionlistAssignment )*
            {
             before(grammarAccess.getHistoryAccess().getActionlistAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__History__ActionlistAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__History__ActionlistAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__History__ActionlistAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getHistoryAccess().getActionlistAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHistory"


    // $ANTLR start "entryRuleCharacterAction"
    // InternalMyDsl.g:78:1: entryRuleCharacterAction : ruleCharacterAction EOF ;
    public final void entryRuleCharacterAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCharacterAction EOF )
            // InternalMyDsl.g:80:1: ruleCharacterAction EOF
            {
             before(grammarAccess.getCharacterActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacterAction();

            state._fsp--;

             after(grammarAccess.getCharacterActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacterAction"


    // $ANTLR start "ruleCharacterAction"
    // InternalMyDsl.g:87:1: ruleCharacterAction : ( ( rule__CharacterAction__Group__0 ) ) ;
    public final void ruleCharacterAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__CharacterAction__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__CharacterAction__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__CharacterAction__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__CharacterAction__Group__0 )
            {
             before(grammarAccess.getCharacterActionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__CharacterAction__Group__0 )
            // InternalMyDsl.g:94:4: rule__CharacterAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterAction"


    // $ANTLR start "entryRuleActions"
    // InternalMyDsl.g:103:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleActions EOF )
            // InternalMyDsl.g:105:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalMyDsl.g:112:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Actions__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Actions__Alternatives )
            // InternalMyDsl.g:119:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:128:1: entryRuleRest : ruleRest EOF ;
    public final void entryRuleRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRest EOF )
            // InternalMyDsl.g:130:1: ruleRest EOF
            {
             before(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:137:1: ruleRest : ( ( rule__Rest__Alternatives ) ) ;
    public final void ruleRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Rest__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Rest__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Rest__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Rest__Alternatives )
            {
             before(grammarAccess.getRestAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Rest__Alternatives )
            // InternalMyDsl.g:144:4: rule__Rest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleLongRest"
    // InternalMyDsl.g:153:1: entryRuleLongRest : ruleLongRest EOF ;
    public final void entryRuleLongRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLongRest EOF )
            // InternalMyDsl.g:155:1: ruleLongRest EOF
            {
             before(grammarAccess.getLongRestRule()); 
            pushFollow(FOLLOW_1);
            ruleLongRest();

            state._fsp--;

             after(grammarAccess.getLongRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLongRest"


    // $ANTLR start "ruleLongRest"
    // InternalMyDsl.g:162:1: ruleLongRest : ( ( rule__LongRest__Group__0 ) ) ;
    public final void ruleLongRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__LongRest__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__LongRest__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__LongRest__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__LongRest__Group__0 )
            {
             before(grammarAccess.getLongRestAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__LongRest__Group__0 )
            // InternalMyDsl.g:169:4: rule__LongRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LongRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLongRest"


    // $ANTLR start "entryRuleShortRest"
    // InternalMyDsl.g:178:1: entryRuleShortRest : ruleShortRest EOF ;
    public final void entryRuleShortRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleShortRest EOF )
            // InternalMyDsl.g:180:1: ruleShortRest EOF
            {
             before(grammarAccess.getShortRestRule()); 
            pushFollow(FOLLOW_1);
            ruleShortRest();

            state._fsp--;

             after(grammarAccess.getShortRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShortRest"


    // $ANTLR start "ruleShortRest"
    // InternalMyDsl.g:187:1: ruleShortRest : ( ( rule__ShortRest__Group__0 ) ) ;
    public final void ruleShortRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ShortRest__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ShortRest__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ShortRest__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ShortRest__Group__0 )
            {
             before(grammarAccess.getShortRestAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ShortRest__Group__0 )
            // InternalMyDsl.g:194:4: rule__ShortRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShortRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShortRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShortRest"


    // $ANTLR start "entryRuleSpell"
    // InternalMyDsl.g:203:1: entryRuleSpell : ruleSpell EOF ;
    public final void entryRuleSpell() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSpell EOF )
            // InternalMyDsl.g:205:1: ruleSpell EOF
            {
             before(grammarAccess.getSpellRule()); 
            pushFollow(FOLLOW_1);
            ruleSpell();

            state._fsp--;

             after(grammarAccess.getSpellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpell"


    // $ANTLR start "ruleSpell"
    // InternalMyDsl.g:212:1: ruleSpell : ( ( rule__Spell__Group__0 ) ) ;
    public final void ruleSpell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Spell__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Spell__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Spell__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Spell__Group__0 )
            {
             before(grammarAccess.getSpellAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Spell__Group__0 )
            // InternalMyDsl.g:219:4: rule__Spell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpell"


    // $ANTLR start "entryRuleAttack"
    // InternalMyDsl.g:228:1: entryRuleAttack : ruleAttack EOF ;
    public final void entryRuleAttack() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAttack EOF )
            // InternalMyDsl.g:230:1: ruleAttack EOF
            {
             before(grammarAccess.getAttackRule()); 
            pushFollow(FOLLOW_1);
            ruleAttack();

            state._fsp--;

             after(grammarAccess.getAttackRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttack"


    // $ANTLR start "ruleAttack"
    // InternalMyDsl.g:237:1: ruleAttack : ( ( rule__Attack__Group__0 ) ) ;
    public final void ruleAttack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Attack__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Attack__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Attack__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Attack__Group__0 )
            {
             before(grammarAccess.getAttackAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Attack__Group__0 )
            // InternalMyDsl.g:244:4: rule__Attack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attack__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttack"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:253:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMove EOF )
            // InternalMyDsl.g:255:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:262:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Move__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Move__Group__0 )
            // InternalMyDsl.g:269:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalMyDsl.g:277:1: rule__Actions__Alternatives : ( ( ruleRest ) | ( ruleSpell ) | ( ruleAttack ) | ( ruleMove ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ruleRest ) | ( ruleSpell ) | ( ruleAttack ) | ( ruleMove ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ruleRest )
                    {
                    // InternalMyDsl.g:282:2: ( ruleRest )
                    // InternalMyDsl.g:283:3: ruleRest
                    {
                     before(grammarAccess.getActionsAccess().getRestParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRest();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ruleSpell )
                    {
                    // InternalMyDsl.g:288:2: ( ruleSpell )
                    // InternalMyDsl.g:289:3: ruleSpell
                    {
                     before(grammarAccess.getActionsAccess().getSpellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpell();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getSpellParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ruleAttack )
                    {
                    // InternalMyDsl.g:294:2: ( ruleAttack )
                    // InternalMyDsl.g:295:3: ruleAttack
                    {
                     before(grammarAccess.getActionsAccess().getAttackParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttack();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getAttackParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:300:2: ( ruleMove )
                    {
                    // InternalMyDsl.g:300:2: ( ruleMove )
                    // InternalMyDsl.g:301:3: ruleMove
                    {
                     before(grammarAccess.getActionsAccess().getMoveParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getMoveParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__Rest__Alternatives"
    // InternalMyDsl.g:310:1: rule__Rest__Alternatives : ( ( ruleLongRest ) | ( ruleShortRest ) );
    public final void rule__Rest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ruleLongRest ) | ( ruleShortRest ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:315:2: ( ruleLongRest )
                    {
                    // InternalMyDsl.g:315:2: ( ruleLongRest )
                    // InternalMyDsl.g:316:3: ruleLongRest
                    {
                     before(grammarAccess.getRestAccess().getLongRestParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLongRest();

                    state._fsp--;

                     after(grammarAccess.getRestAccess().getLongRestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:321:2: ( ruleShortRest )
                    {
                    // InternalMyDsl.g:321:2: ( ruleShortRest )
                    // InternalMyDsl.g:322:3: ruleShortRest
                    {
                     before(grammarAccess.getRestAccess().getShortRestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShortRest();

                    state._fsp--;

                     after(grammarAccess.getRestAccess().getShortRestParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Alternatives"


    // $ANTLR start "rule__CharacterAction__Group__0"
    // InternalMyDsl.g:331:1: rule__CharacterAction__Group__0 : rule__CharacterAction__Group__0__Impl rule__CharacterAction__Group__1 ;
    public final void rule__CharacterAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__CharacterAction__Group__0__Impl rule__CharacterAction__Group__1 )
            // InternalMyDsl.g:336:2: rule__CharacterAction__Group__0__Impl rule__CharacterAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacterAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__0"


    // $ANTLR start "rule__CharacterAction__Group__0__Impl"
    // InternalMyDsl.g:343:1: rule__CharacterAction__Group__0__Impl : ( 'Character' ) ;
    public final void rule__CharacterAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( 'Character' ) )
            // InternalMyDsl.g:348:1: ( 'Character' )
            {
            // InternalMyDsl.g:348:1: ( 'Character' )
            // InternalMyDsl.g:349:2: 'Character'
            {
             before(grammarAccess.getCharacterActionAccess().getCharacterKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCharacterActionAccess().getCharacterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__0__Impl"


    // $ANTLR start "rule__CharacterAction__Group__1"
    // InternalMyDsl.g:358:1: rule__CharacterAction__Group__1 : rule__CharacterAction__Group__1__Impl rule__CharacterAction__Group__2 ;
    public final void rule__CharacterAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__CharacterAction__Group__1__Impl rule__CharacterAction__Group__2 )
            // InternalMyDsl.g:363:2: rule__CharacterAction__Group__1__Impl rule__CharacterAction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CharacterAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__1"


    // $ANTLR start "rule__CharacterAction__Group__1__Impl"
    // InternalMyDsl.g:370:1: rule__CharacterAction__Group__1__Impl : ( ( rule__CharacterAction__NameAssignment_1 ) ) ;
    public final void rule__CharacterAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( ( rule__CharacterAction__NameAssignment_1 ) ) )
            // InternalMyDsl.g:375:1: ( ( rule__CharacterAction__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:375:1: ( ( rule__CharacterAction__NameAssignment_1 ) )
            // InternalMyDsl.g:376:2: ( rule__CharacterAction__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterActionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:377:2: ( rule__CharacterAction__NameAssignment_1 )
            // InternalMyDsl.g:377:3: rule__CharacterAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__1__Impl"


    // $ANTLR start "rule__CharacterAction__Group__2"
    // InternalMyDsl.g:385:1: rule__CharacterAction__Group__2 : rule__CharacterAction__Group__2__Impl ;
    public final void rule__CharacterAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__CharacterAction__Group__2__Impl )
            // InternalMyDsl.g:390:2: rule__CharacterAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__2"


    // $ANTLR start "rule__CharacterAction__Group__2__Impl"
    // InternalMyDsl.g:396:1: rule__CharacterAction__Group__2__Impl : ( ( ( rule__CharacterAction__ActionsAssignment_2 ) ) ( ( rule__CharacterAction__ActionsAssignment_2 )* ) ) ;
    public final void rule__CharacterAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( ( ( rule__CharacterAction__ActionsAssignment_2 ) ) ( ( rule__CharacterAction__ActionsAssignment_2 )* ) ) )
            // InternalMyDsl.g:401:1: ( ( ( rule__CharacterAction__ActionsAssignment_2 ) ) ( ( rule__CharacterAction__ActionsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:401:1: ( ( ( rule__CharacterAction__ActionsAssignment_2 ) ) ( ( rule__CharacterAction__ActionsAssignment_2 )* ) )
            // InternalMyDsl.g:402:2: ( ( rule__CharacterAction__ActionsAssignment_2 ) ) ( ( rule__CharacterAction__ActionsAssignment_2 )* )
            {
            // InternalMyDsl.g:402:2: ( ( rule__CharacterAction__ActionsAssignment_2 ) )
            // InternalMyDsl.g:403:3: ( rule__CharacterAction__ActionsAssignment_2 )
            {
             before(grammarAccess.getCharacterActionAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:404:3: ( rule__CharacterAction__ActionsAssignment_2 )
            // InternalMyDsl.g:404:4: rule__CharacterAction__ActionsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__CharacterAction__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterActionAccess().getActionsAssignment_2()); 

            }

            // InternalMyDsl.g:407:2: ( ( rule__CharacterAction__ActionsAssignment_2 )* )
            // InternalMyDsl.g:408:3: ( rule__CharacterAction__ActionsAssignment_2 )*
            {
             before(grammarAccess.getCharacterActionAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:409:3: ( rule__CharacterAction__ActionsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:409:4: rule__CharacterAction__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CharacterAction__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCharacterActionAccess().getActionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__Group__2__Impl"


    // $ANTLR start "rule__LongRest__Group__0"
    // InternalMyDsl.g:419:1: rule__LongRest__Group__0 : rule__LongRest__Group__0__Impl rule__LongRest__Group__1 ;
    public final void rule__LongRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( rule__LongRest__Group__0__Impl rule__LongRest__Group__1 )
            // InternalMyDsl.g:424:2: rule__LongRest__Group__0__Impl rule__LongRest__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LongRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LongRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongRest__Group__0"


    // $ANTLR start "rule__LongRest__Group__0__Impl"
    // InternalMyDsl.g:431:1: rule__LongRest__Group__0__Impl : ( 'LongRest' ) ;
    public final void rule__LongRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( 'LongRest' ) )
            // InternalMyDsl.g:436:1: ( 'LongRest' )
            {
            // InternalMyDsl.g:436:1: ( 'LongRest' )
            // InternalMyDsl.g:437:2: 'LongRest'
            {
             before(grammarAccess.getLongRestAccess().getLongRestKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLongRestAccess().getLongRestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongRest__Group__0__Impl"


    // $ANTLR start "rule__LongRest__Group__1"
    // InternalMyDsl.g:446:1: rule__LongRest__Group__1 : rule__LongRest__Group__1__Impl ;
    public final void rule__LongRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:450:1: ( rule__LongRest__Group__1__Impl )
            // InternalMyDsl.g:451:2: rule__LongRest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LongRest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongRest__Group__1"


    // $ANTLR start "rule__LongRest__Group__1__Impl"
    // InternalMyDsl.g:457:1: rule__LongRest__Group__1__Impl : ( ( rule__LongRest__LevelAssignment_1 ) ) ;
    public final void rule__LongRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( ( rule__LongRest__LevelAssignment_1 ) ) )
            // InternalMyDsl.g:462:1: ( ( rule__LongRest__LevelAssignment_1 ) )
            {
            // InternalMyDsl.g:462:1: ( ( rule__LongRest__LevelAssignment_1 ) )
            // InternalMyDsl.g:463:2: ( rule__LongRest__LevelAssignment_1 )
            {
             before(grammarAccess.getLongRestAccess().getLevelAssignment_1()); 
            // InternalMyDsl.g:464:2: ( rule__LongRest__LevelAssignment_1 )
            // InternalMyDsl.g:464:3: rule__LongRest__LevelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LongRest__LevelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLongRestAccess().getLevelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongRest__Group__1__Impl"


    // $ANTLR start "rule__ShortRest__Group__0"
    // InternalMyDsl.g:473:1: rule__ShortRest__Group__0 : rule__ShortRest__Group__0__Impl rule__ShortRest__Group__1 ;
    public final void rule__ShortRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( rule__ShortRest__Group__0__Impl rule__ShortRest__Group__1 )
            // InternalMyDsl.g:478:2: rule__ShortRest__Group__0__Impl rule__ShortRest__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ShortRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShortRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortRest__Group__0"


    // $ANTLR start "rule__ShortRest__Group__0__Impl"
    // InternalMyDsl.g:485:1: rule__ShortRest__Group__0__Impl : ( 'ShortRest' ) ;
    public final void rule__ShortRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( 'ShortRest' ) )
            // InternalMyDsl.g:490:1: ( 'ShortRest' )
            {
            // InternalMyDsl.g:490:1: ( 'ShortRest' )
            // InternalMyDsl.g:491:2: 'ShortRest'
            {
             before(grammarAccess.getShortRestAccess().getShortRestKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShortRestAccess().getShortRestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortRest__Group__0__Impl"


    // $ANTLR start "rule__ShortRest__Group__1"
    // InternalMyDsl.g:500:1: rule__ShortRest__Group__1 : rule__ShortRest__Group__1__Impl ;
    public final void rule__ShortRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( rule__ShortRest__Group__1__Impl )
            // InternalMyDsl.g:505:2: rule__ShortRest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShortRest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortRest__Group__1"


    // $ANTLR start "rule__ShortRest__Group__1__Impl"
    // InternalMyDsl.g:511:1: rule__ShortRest__Group__1__Impl : ( ( rule__ShortRest__HealingAssignment_1 ) ) ;
    public final void rule__ShortRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( ( rule__ShortRest__HealingAssignment_1 ) ) )
            // InternalMyDsl.g:516:1: ( ( rule__ShortRest__HealingAssignment_1 ) )
            {
            // InternalMyDsl.g:516:1: ( ( rule__ShortRest__HealingAssignment_1 ) )
            // InternalMyDsl.g:517:2: ( rule__ShortRest__HealingAssignment_1 )
            {
             before(grammarAccess.getShortRestAccess().getHealingAssignment_1()); 
            // InternalMyDsl.g:518:2: ( rule__ShortRest__HealingAssignment_1 )
            // InternalMyDsl.g:518:3: rule__ShortRest__HealingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShortRest__HealingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShortRestAccess().getHealingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortRest__Group__1__Impl"


    // $ANTLR start "rule__Spell__Group__0"
    // InternalMyDsl.g:527:1: rule__Spell__Group__0 : rule__Spell__Group__0__Impl rule__Spell__Group__1 ;
    public final void rule__Spell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( rule__Spell__Group__0__Impl rule__Spell__Group__1 )
            // InternalMyDsl.g:532:2: rule__Spell__Group__0__Impl rule__Spell__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Spell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__0"


    // $ANTLR start "rule__Spell__Group__0__Impl"
    // InternalMyDsl.g:539:1: rule__Spell__Group__0__Impl : ( 'Spell' ) ;
    public final void rule__Spell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( 'Spell' ) )
            // InternalMyDsl.g:544:1: ( 'Spell' )
            {
            // InternalMyDsl.g:544:1: ( 'Spell' )
            // InternalMyDsl.g:545:2: 'Spell'
            {
             before(grammarAccess.getSpellAccess().getSpellKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSpellAccess().getSpellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__0__Impl"


    // $ANTLR start "rule__Spell__Group__1"
    // InternalMyDsl.g:554:1: rule__Spell__Group__1 : rule__Spell__Group__1__Impl rule__Spell__Group__2 ;
    public final void rule__Spell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( rule__Spell__Group__1__Impl rule__Spell__Group__2 )
            // InternalMyDsl.g:559:2: rule__Spell__Group__1__Impl rule__Spell__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Spell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__1"


    // $ANTLR start "rule__Spell__Group__1__Impl"
    // InternalMyDsl.g:566:1: rule__Spell__Group__1__Impl : ( ( rule__Spell__NameAssignment_1 ) ) ;
    public final void rule__Spell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( ( ( rule__Spell__NameAssignment_1 ) ) )
            // InternalMyDsl.g:571:1: ( ( rule__Spell__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:571:1: ( ( rule__Spell__NameAssignment_1 ) )
            // InternalMyDsl.g:572:2: ( rule__Spell__NameAssignment_1 )
            {
             before(grammarAccess.getSpellAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:573:2: ( rule__Spell__NameAssignment_1 )
            // InternalMyDsl.g:573:3: rule__Spell__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Spell__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpellAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__1__Impl"


    // $ANTLR start "rule__Spell__Group__2"
    // InternalMyDsl.g:581:1: rule__Spell__Group__2 : rule__Spell__Group__2__Impl ;
    public final void rule__Spell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( rule__Spell__Group__2__Impl )
            // InternalMyDsl.g:586:2: rule__Spell__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spell__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__2"


    // $ANTLR start "rule__Spell__Group__2__Impl"
    // InternalMyDsl.g:592:1: rule__Spell__Group__2__Impl : ( ( rule__Spell__LevelAssignment_2 ) ) ;
    public final void rule__Spell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ( rule__Spell__LevelAssignment_2 ) ) )
            // InternalMyDsl.g:597:1: ( ( rule__Spell__LevelAssignment_2 ) )
            {
            // InternalMyDsl.g:597:1: ( ( rule__Spell__LevelAssignment_2 ) )
            // InternalMyDsl.g:598:2: ( rule__Spell__LevelAssignment_2 )
            {
             before(grammarAccess.getSpellAccess().getLevelAssignment_2()); 
            // InternalMyDsl.g:599:2: ( rule__Spell__LevelAssignment_2 )
            // InternalMyDsl.g:599:3: rule__Spell__LevelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spell__LevelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpellAccess().getLevelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__Group__2__Impl"


    // $ANTLR start "rule__Attack__Group__0"
    // InternalMyDsl.g:608:1: rule__Attack__Group__0 : rule__Attack__Group__0__Impl rule__Attack__Group__1 ;
    public final void rule__Attack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( rule__Attack__Group__0__Impl rule__Attack__Group__1 )
            // InternalMyDsl.g:613:2: rule__Attack__Group__0__Impl rule__Attack__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Attack__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attack__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__0"


    // $ANTLR start "rule__Attack__Group__0__Impl"
    // InternalMyDsl.g:620:1: rule__Attack__Group__0__Impl : ( 'Attack' ) ;
    public final void rule__Attack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( 'Attack' ) )
            // InternalMyDsl.g:625:1: ( 'Attack' )
            {
            // InternalMyDsl.g:625:1: ( 'Attack' )
            // InternalMyDsl.g:626:2: 'Attack'
            {
             before(grammarAccess.getAttackAccess().getAttackKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttackAccess().getAttackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__0__Impl"


    // $ANTLR start "rule__Attack__Group__1"
    // InternalMyDsl.g:635:1: rule__Attack__Group__1 : rule__Attack__Group__1__Impl ;
    public final void rule__Attack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( rule__Attack__Group__1__Impl )
            // InternalMyDsl.g:640:2: rule__Attack__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attack__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__1"


    // $ANTLR start "rule__Attack__Group__1__Impl"
    // InternalMyDsl.g:646:1: rule__Attack__Group__1__Impl : ( ( rule__Attack__DamageAssignment_1 ) ) ;
    public final void rule__Attack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Attack__DamageAssignment_1 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Attack__DamageAssignment_1 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Attack__DamageAssignment_1 ) )
            // InternalMyDsl.g:652:2: ( rule__Attack__DamageAssignment_1 )
            {
             before(grammarAccess.getAttackAccess().getDamageAssignment_1()); 
            // InternalMyDsl.g:653:2: ( rule__Attack__DamageAssignment_1 )
            // InternalMyDsl.g:653:3: rule__Attack__DamageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attack__DamageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackAccess().getDamageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalMyDsl.g:662:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalMyDsl.g:667:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalMyDsl.g:674:1: rule__Move__Group__0__Impl : ( 'Move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( 'Move' ) )
            // InternalMyDsl.g:679:1: ( 'Move' )
            {
            // InternalMyDsl.g:679:1: ( 'Move' )
            // InternalMyDsl.g:680:2: 'Move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalMyDsl.g:689:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( rule__Move__Group__1__Impl )
            // InternalMyDsl.g:694:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalMyDsl.g:700:1: rule__Move__Group__1__Impl : ( ( rule__Move__DistanceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Move__DistanceAssignment_1 ) ) )
            // InternalMyDsl.g:705:1: ( ( rule__Move__DistanceAssignment_1 ) )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Move__DistanceAssignment_1 ) )
            // InternalMyDsl.g:706:2: ( rule__Move__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getDistanceAssignment_1()); 
            // InternalMyDsl.g:707:2: ( rule__Move__DistanceAssignment_1 )
            // InternalMyDsl.g:707:3: rule__Move__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__History__ActionlistAssignment"
    // InternalMyDsl.g:716:1: rule__History__ActionlistAssignment : ( ruleCharacterAction ) ;
    public final void rule__History__ActionlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( ( ruleCharacterAction ) )
            // InternalMyDsl.g:721:2: ( ruleCharacterAction )
            {
            // InternalMyDsl.g:721:2: ( ruleCharacterAction )
            // InternalMyDsl.g:722:3: ruleCharacterAction
            {
             before(grammarAccess.getHistoryAccess().getActionlistCharacterActionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacterAction();

            state._fsp--;

             after(grammarAccess.getHistoryAccess().getActionlistCharacterActionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__History__ActionlistAssignment"


    // $ANTLR start "rule__CharacterAction__NameAssignment_1"
    // InternalMyDsl.g:731:1: rule__CharacterAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacterAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:735:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:736:2: ( RULE_ID )
            {
            // InternalMyDsl.g:736:2: ( RULE_ID )
            // InternalMyDsl.g:737:3: RULE_ID
            {
             before(grammarAccess.getCharacterActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacterActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__NameAssignment_1"


    // $ANTLR start "rule__CharacterAction__ActionsAssignment_2"
    // InternalMyDsl.g:746:1: rule__CharacterAction__ActionsAssignment_2 : ( ruleActions ) ;
    public final void rule__CharacterAction__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ruleActions ) )
            // InternalMyDsl.g:751:2: ( ruleActions )
            {
            // InternalMyDsl.g:751:2: ( ruleActions )
            // InternalMyDsl.g:752:3: ruleActions
            {
             before(grammarAccess.getCharacterActionAccess().getActionsActionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getCharacterActionAccess().getActionsActionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAction__ActionsAssignment_2"


    // $ANTLR start "rule__LongRest__LevelAssignment_1"
    // InternalMyDsl.g:761:1: rule__LongRest__LevelAssignment_1 : ( RULE_INT ) ;
    public final void rule__LongRest__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:766:2: ( RULE_INT )
            {
            // InternalMyDsl.g:766:2: ( RULE_INT )
            // InternalMyDsl.g:767:3: RULE_INT
            {
             before(grammarAccess.getLongRestAccess().getLevelINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLongRestAccess().getLevelINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongRest__LevelAssignment_1"


    // $ANTLR start "rule__ShortRest__HealingAssignment_1"
    // InternalMyDsl.g:776:1: rule__ShortRest__HealingAssignment_1 : ( RULE_INT ) ;
    public final void rule__ShortRest__HealingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:781:2: ( RULE_INT )
            {
            // InternalMyDsl.g:781:2: ( RULE_INT )
            // InternalMyDsl.g:782:3: RULE_INT
            {
             before(grammarAccess.getShortRestAccess().getHealingINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getShortRestAccess().getHealingINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShortRest__HealingAssignment_1"


    // $ANTLR start "rule__Spell__NameAssignment_1"
    // InternalMyDsl.g:791:1: rule__Spell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:796:2: ( RULE_ID )
            {
            // InternalMyDsl.g:796:2: ( RULE_ID )
            // InternalMyDsl.g:797:3: RULE_ID
            {
             before(grammarAccess.getSpellAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpellAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__NameAssignment_1"


    // $ANTLR start "rule__Spell__LevelAssignment_2"
    // InternalMyDsl.g:806:1: rule__Spell__LevelAssignment_2 : ( RULE_INT ) ;
    public final void rule__Spell__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:811:2: ( RULE_INT )
            {
            // InternalMyDsl.g:811:2: ( RULE_INT )
            // InternalMyDsl.g:812:3: RULE_INT
            {
             before(grammarAccess.getSpellAccess().getLevelINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpellAccess().getLevelINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spell__LevelAssignment_2"


    // $ANTLR start "rule__Attack__DamageAssignment_1"
    // InternalMyDsl.g:821:1: rule__Attack__DamageAssignment_1 : ( RULE_INT ) ;
    public final void rule__Attack__DamageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:826:2: ( RULE_INT )
            {
            // InternalMyDsl.g:826:2: ( RULE_INT )
            // InternalMyDsl.g:827:3: RULE_INT
            {
             before(grammarAccess.getAttackAccess().getDamageINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttackAccess().getDamageINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__DamageAssignment_1"


    // $ANTLR start "rule__Move__DistanceAssignment_1"
    // InternalMyDsl.g:836:1: rule__Move__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__Move__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:841:2: ( RULE_INT )
            {
            // InternalMyDsl.g:841:2: ( RULE_INT )
            // InternalMyDsl.g:842:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}