package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "History";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHistory"
    // InternalMyDsl.g:64:1: entryRuleHistory returns [EObject current=null] : iv_ruleHistory= ruleHistory EOF ;
    public final EObject entryRuleHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistory = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleHistory= ruleHistory EOF )
            // InternalMyDsl.g:65:2: iv_ruleHistory= ruleHistory EOF
            {
             newCompositeNode(grammarAccess.getHistoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHistory=ruleHistory();

            state._fsp--;

             current =iv_ruleHistory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHistory"


    // $ANTLR start "ruleHistory"
    // InternalMyDsl.g:71:1: ruleHistory returns [EObject current=null] : ( (lv_actionlist_0_0= ruleCharacterAction ) )* ;
    public final EObject ruleHistory() throws RecognitionException {
        EObject current = null;

        EObject lv_actionlist_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_actionlist_0_0= ruleCharacterAction ) )* )
            // InternalMyDsl.g:78:2: ( (lv_actionlist_0_0= ruleCharacterAction ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_actionlist_0_0= ruleCharacterAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_actionlist_0_0= ruleCharacterAction )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_actionlist_0_0= ruleCharacterAction )
            	    // InternalMyDsl.g:80:4: lv_actionlist_0_0= ruleCharacterAction
            	    {

            	    				newCompositeNode(grammarAccess.getHistoryAccess().getActionlistCharacterActionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_actionlist_0_0=ruleCharacterAction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getHistoryRule());
            	    				}
            	    				add(
            	    					current,
            	    					"actionlist",
            	    					lv_actionlist_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.CharacterAction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHistory"


    // $ANTLR start "entryRuleCharacterAction"
    // InternalMyDsl.g:100:1: entryRuleCharacterAction returns [EObject current=null] : iv_ruleCharacterAction= ruleCharacterAction EOF ;
    public final EObject entryRuleCharacterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterAction = null;


        try {
            // InternalMyDsl.g:100:56: (iv_ruleCharacterAction= ruleCharacterAction EOF )
            // InternalMyDsl.g:101:2: iv_ruleCharacterAction= ruleCharacterAction EOF
            {
             newCompositeNode(grammarAccess.getCharacterActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterAction=ruleCharacterAction();

            state._fsp--;

             current =iv_ruleCharacterAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterAction"


    // $ANTLR start "ruleCharacterAction"
    // InternalMyDsl.g:107:1: ruleCharacterAction returns [EObject current=null] : (otherlv_0= 'Character' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleActions ) )+ ) ;
    public final EObject ruleCharacterAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Character' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleActions ) )+ ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Character' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleActions ) )+ )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Character' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleActions ) )+ )
            // InternalMyDsl.g:115:3: otherlv_0= 'Character' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actions_2_0= ruleActions ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterActionAccess().getCharacterKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacterActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:137:3: ( (lv_actions_2_0= ruleActions ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:138:4: (lv_actions_2_0= ruleActions )
            	    {
            	    // InternalMyDsl.g:138:4: (lv_actions_2_0= ruleActions )
            	    // InternalMyDsl.g:139:5: lv_actions_2_0= ruleActions
            	    {

            	    					newCompositeNode(grammarAccess.getCharacterActionAccess().getActionsActionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_actions_2_0=ruleActions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCharacterActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Actions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterAction"


    // $ANTLR start "entryRuleActions"
    // InternalMyDsl.g:160:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalMyDsl.g:160:48: (iv_ruleActions= ruleActions EOF )
            // InternalMyDsl.g:161:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalMyDsl.g:167:1: ruleActions returns [EObject current=null] : (this_Rest_0= ruleRest | this_Spell_1= ruleSpell | this_Attack_2= ruleAttack | this_Move_3= ruleMove ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject this_Rest_0 = null;

        EObject this_Spell_1 = null;

        EObject this_Attack_2 = null;

        EObject this_Move_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:173:2: ( (this_Rest_0= ruleRest | this_Spell_1= ruleSpell | this_Attack_2= ruleAttack | this_Move_3= ruleMove ) )
            // InternalMyDsl.g:174:2: (this_Rest_0= ruleRest | this_Spell_1= ruleSpell | this_Attack_2= ruleAttack | this_Move_3= ruleMove )
            {
            // InternalMyDsl.g:174:2: (this_Rest_0= ruleRest | this_Spell_1= ruleSpell | this_Attack_2= ruleAttack | this_Move_3= ruleMove )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:175:3: this_Rest_0= ruleRest
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getRestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rest_0=ruleRest();

                    state._fsp--;


                    			current = this_Rest_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:184:3: this_Spell_1= ruleSpell
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getSpellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Spell_1=ruleSpell();

                    state._fsp--;


                    			current = this_Spell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:193:3: this_Attack_2= ruleAttack
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getAttackParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attack_2=ruleAttack();

                    state._fsp--;


                    			current = this_Attack_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:202:3: this_Move_3= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getMoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_3=ruleMove();

                    state._fsp--;


                    			current = this_Move_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:214:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalMyDsl.g:214:45: (iv_ruleRest= ruleRest EOF )
            // InternalMyDsl.g:215:2: iv_ruleRest= ruleRest EOF
            {
             newCompositeNode(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRest=ruleRest();

            state._fsp--;

             current =iv_ruleRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:221:1: ruleRest returns [EObject current=null] : (this_LongRest_0= ruleLongRest | this_ShortRest_1= ruleShortRest ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        EObject this_LongRest_0 = null;

        EObject this_ShortRest_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:227:2: ( (this_LongRest_0= ruleLongRest | this_ShortRest_1= ruleShortRest ) )
            // InternalMyDsl.g:228:2: (this_LongRest_0= ruleLongRest | this_ShortRest_1= ruleShortRest )
            {
            // InternalMyDsl.g:228:2: (this_LongRest_0= ruleLongRest | this_ShortRest_1= ruleShortRest )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:229:3: this_LongRest_0= ruleLongRest
                    {

                    			newCompositeNode(grammarAccess.getRestAccess().getLongRestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LongRest_0=ruleLongRest();

                    state._fsp--;


                    			current = this_LongRest_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:3: this_ShortRest_1= ruleShortRest
                    {

                    			newCompositeNode(grammarAccess.getRestAccess().getShortRestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShortRest_1=ruleShortRest();

                    state._fsp--;


                    			current = this_ShortRest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleLongRest"
    // InternalMyDsl.g:250:1: entryRuleLongRest returns [EObject current=null] : iv_ruleLongRest= ruleLongRest EOF ;
    public final EObject entryRuleLongRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongRest = null;


        try {
            // InternalMyDsl.g:250:49: (iv_ruleLongRest= ruleLongRest EOF )
            // InternalMyDsl.g:251:2: iv_ruleLongRest= ruleLongRest EOF
            {
             newCompositeNode(grammarAccess.getLongRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongRest=ruleLongRest();

            state._fsp--;

             current =iv_ruleLongRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongRest"


    // $ANTLR start "ruleLongRest"
    // InternalMyDsl.g:257:1: ruleLongRest returns [EObject current=null] : (otherlv_0= 'LongRest' ( (lv_level_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLongRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_level_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:263:2: ( (otherlv_0= 'LongRest' ( (lv_level_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:264:2: (otherlv_0= 'LongRest' ( (lv_level_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:264:2: (otherlv_0= 'LongRest' ( (lv_level_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:265:3: otherlv_0= 'LongRest' ( (lv_level_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLongRestAccess().getLongRestKeyword_0());
            		
            // InternalMyDsl.g:269:3: ( (lv_level_1_0= RULE_INT ) )
            // InternalMyDsl.g:270:4: (lv_level_1_0= RULE_INT )
            {
            // InternalMyDsl.g:270:4: (lv_level_1_0= RULE_INT )
            // InternalMyDsl.g:271:5: lv_level_1_0= RULE_INT
            {
            lv_level_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_level_1_0, grammarAccess.getLongRestAccess().getLevelINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLongRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongRest"


    // $ANTLR start "entryRuleShortRest"
    // InternalMyDsl.g:291:1: entryRuleShortRest returns [EObject current=null] : iv_ruleShortRest= ruleShortRest EOF ;
    public final EObject entryRuleShortRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortRest = null;


        try {
            // InternalMyDsl.g:291:50: (iv_ruleShortRest= ruleShortRest EOF )
            // InternalMyDsl.g:292:2: iv_ruleShortRest= ruleShortRest EOF
            {
             newCompositeNode(grammarAccess.getShortRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortRest=ruleShortRest();

            state._fsp--;

             current =iv_ruleShortRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortRest"


    // $ANTLR start "ruleShortRest"
    // InternalMyDsl.g:298:1: ruleShortRest returns [EObject current=null] : (otherlv_0= 'ShortRest' ( (lv_healing_1_0= RULE_INT ) ) ) ;
    public final EObject ruleShortRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_healing_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( (otherlv_0= 'ShortRest' ( (lv_healing_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:305:2: (otherlv_0= 'ShortRest' ( (lv_healing_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:305:2: (otherlv_0= 'ShortRest' ( (lv_healing_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:306:3: otherlv_0= 'ShortRest' ( (lv_healing_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getShortRestAccess().getShortRestKeyword_0());
            		
            // InternalMyDsl.g:310:3: ( (lv_healing_1_0= RULE_INT ) )
            // InternalMyDsl.g:311:4: (lv_healing_1_0= RULE_INT )
            {
            // InternalMyDsl.g:311:4: (lv_healing_1_0= RULE_INT )
            // InternalMyDsl.g:312:5: lv_healing_1_0= RULE_INT
            {
            lv_healing_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_healing_1_0, grammarAccess.getShortRestAccess().getHealingINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShortRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"healing",
            						lv_healing_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShortRest"


    // $ANTLR start "entryRuleSpell"
    // InternalMyDsl.g:332:1: entryRuleSpell returns [EObject current=null] : iv_ruleSpell= ruleSpell EOF ;
    public final EObject entryRuleSpell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpell = null;


        try {
            // InternalMyDsl.g:332:46: (iv_ruleSpell= ruleSpell EOF )
            // InternalMyDsl.g:333:2: iv_ruleSpell= ruleSpell EOF
            {
             newCompositeNode(grammarAccess.getSpellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpell=ruleSpell();

            state._fsp--;

             current =iv_ruleSpell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpell"


    // $ANTLR start "ruleSpell"
    // InternalMyDsl.g:339:1: ruleSpell returns [EObject current=null] : (otherlv_0= 'Spell' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSpell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_level_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:345:2: ( (otherlv_0= 'Spell' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:346:2: (otherlv_0= 'Spell' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:346:2: (otherlv_0= 'Spell' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:347:3: otherlv_0= 'Spell' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpellAccess().getSpellKeyword_0());
            		
            // InternalMyDsl.g:351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:352:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpellAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:369:3: ( (lv_level_2_0= RULE_INT ) )
            // InternalMyDsl.g:370:4: (lv_level_2_0= RULE_INT )
            {
            // InternalMyDsl.g:370:4: (lv_level_2_0= RULE_INT )
            // InternalMyDsl.g:371:5: lv_level_2_0= RULE_INT
            {
            lv_level_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_level_2_0, grammarAccess.getSpellAccess().getLevelINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpell"


    // $ANTLR start "entryRuleAttack"
    // InternalMyDsl.g:391:1: entryRuleAttack returns [EObject current=null] : iv_ruleAttack= ruleAttack EOF ;
    public final EObject entryRuleAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttack = null;


        try {
            // InternalMyDsl.g:391:47: (iv_ruleAttack= ruleAttack EOF )
            // InternalMyDsl.g:392:2: iv_ruleAttack= ruleAttack EOF
            {
             newCompositeNode(grammarAccess.getAttackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttack=ruleAttack();

            state._fsp--;

             current =iv_ruleAttack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttack"


    // $ANTLR start "ruleAttack"
    // InternalMyDsl.g:398:1: ruleAttack returns [EObject current=null] : (otherlv_0= 'Attack' ( (lv_damage_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAttack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_damage_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:404:2: ( (otherlv_0= 'Attack' ( (lv_damage_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:405:2: (otherlv_0= 'Attack' ( (lv_damage_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:405:2: (otherlv_0= 'Attack' ( (lv_damage_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:406:3: otherlv_0= 'Attack' ( (lv_damage_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackAccess().getAttackKeyword_0());
            		
            // InternalMyDsl.g:410:3: ( (lv_damage_1_0= RULE_INT ) )
            // InternalMyDsl.g:411:4: (lv_damage_1_0= RULE_INT )
            {
            // InternalMyDsl.g:411:4: (lv_damage_1_0= RULE_INT )
            // InternalMyDsl.g:412:5: lv_damage_1_0= RULE_INT
            {
            lv_damage_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_damage_1_0, grammarAccess.getAttackAccess().getDamageINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"damage",
            						lv_damage_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttack"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:432:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMyDsl.g:432:45: (iv_ruleMove= ruleMove EOF )
            // InternalMyDsl.g:433:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:439:1: ruleMove returns [EObject current=null] : (otherlv_0= 'Move' ( (lv_distance_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:445:2: ( (otherlv_0= 'Move' ( (lv_distance_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:446:2: (otherlv_0= 'Move' ( (lv_distance_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:446:2: (otherlv_0= 'Move' ( (lv_distance_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:447:3: otherlv_0= 'Move' ( (lv_distance_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalMyDsl.g:451:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalMyDsl.g:452:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalMyDsl.g:452:4: (lv_distance_1_0= RULE_INT )
            // InternalMyDsl.g:453:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}