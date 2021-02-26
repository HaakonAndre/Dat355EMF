/*
 * generated by Xtext 2.24.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleHistory
entryRuleHistory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHistoryRule()); }
	iv_ruleHistory=ruleHistory
	{ $current=$iv_ruleHistory.current; }
	EOF;

// Rule History
ruleHistory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getHistoryAccess().getActionlistCharacterActionParserRuleCall_0());
			}
			lv_actionlist_0_0=ruleCharacterAction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getHistoryRule());
				}
				add(
					$current,
					"actionlist",
					lv_actionlist_0_0,
					"org.xtext.example.mydsl.MyDsl.CharacterAction");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleCharacterAction
entryRuleCharacterAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacterActionRule()); }
	iv_ruleCharacterAction=ruleCharacterAction
	{ $current=$iv_ruleCharacterAction.current; }
	EOF;

// Rule CharacterAction
ruleCharacterAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Character'
		{
			newLeafNode(otherlv_0, grammarAccess.getCharacterActionAccess().getCharacterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCharacterActionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCharacterActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCharacterActionAccess().getActionsActionsParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleActions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCharacterActionRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"org.xtext.example.mydsl.MyDsl.Actions");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleActions
entryRuleActions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionsRule()); }
	iv_ruleActions=ruleActions
	{ $current=$iv_ruleActions.current; }
	EOF;

// Rule Actions
ruleActions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionsAccess().getRestParserRuleCall_0());
		}
		this_Rest_0=ruleRest
		{
			$current = $this_Rest_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getSpellParserRuleCall_1());
		}
		this_Spell_1=ruleSpell
		{
			$current = $this_Spell_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getAttackParserRuleCall_2());
		}
		this_Attack_2=ruleAttack
		{
			$current = $this_Attack_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getMoveParserRuleCall_3());
		}
		this_Move_3=ruleMove
		{
			$current = $this_Move_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRest
entryRuleRest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRestRule()); }
	iv_ruleRest=ruleRest
	{ $current=$iv_ruleRest.current; }
	EOF;

// Rule Rest
ruleRest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRestAccess().getLongRestParserRuleCall_0());
		}
		this_LongRest_0=ruleLongRest
		{
			$current = $this_LongRest_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestAccess().getShortRestParserRuleCall_1());
		}
		this_ShortRest_1=ruleShortRest
		{
			$current = $this_ShortRest_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLongRest
entryRuleLongRest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLongRestRule()); }
	iv_ruleLongRest=ruleLongRest
	{ $current=$iv_ruleLongRest.current; }
	EOF;

// Rule LongRest
ruleLongRest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LongRest'
		{
			newLeafNode(otherlv_0, grammarAccess.getLongRestAccess().getLongRestKeyword_0());
		}
		(
			(
				lv_level_1_0=RULE_INT
				{
					newLeafNode(lv_level_1_0, grammarAccess.getLongRestAccess().getLevelINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLongRestRule());
					}
					setWithLastConsumed(
						$current,
						"level",
						lv_level_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleShortRest
entryRuleShortRest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShortRestRule()); }
	iv_ruleShortRest=ruleShortRest
	{ $current=$iv_ruleShortRest.current; }
	EOF;

// Rule ShortRest
ruleShortRest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ShortRest'
		{
			newLeafNode(otherlv_0, grammarAccess.getShortRestAccess().getShortRestKeyword_0());
		}
		(
			(
				lv_healing_1_0=RULE_INT
				{
					newLeafNode(lv_healing_1_0, grammarAccess.getShortRestAccess().getHealingINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShortRestRule());
					}
					setWithLastConsumed(
						$current,
						"healing",
						lv_healing_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleSpell
entryRuleSpell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpellRule()); }
	iv_ruleSpell=ruleSpell
	{ $current=$iv_ruleSpell.current; }
	EOF;

// Rule Spell
ruleSpell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Spell'
		{
			newLeafNode(otherlv_0, grammarAccess.getSpellAccess().getSpellKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSpellAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpellRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_level_2_0=RULE_INT
				{
					newLeafNode(lv_level_2_0, grammarAccess.getSpellAccess().getLevelINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpellRule());
					}
					setWithLastConsumed(
						$current,
						"level",
						lv_level_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleAttack
entryRuleAttack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttackRule()); }
	iv_ruleAttack=ruleAttack
	{ $current=$iv_ruleAttack.current; }
	EOF;

// Rule Attack
ruleAttack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Attack'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttackAccess().getAttackKeyword_0());
		}
		(
			(
				lv_damage_1_0=RULE_INT
				{
					newLeafNode(lv_damage_1_0, grammarAccess.getAttackAccess().getDamageINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttackRule());
					}
					setWithLastConsumed(
						$current,
						"damage",
						lv_damage_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleMove
entryRuleMove returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveRule()); }
	iv_ruleMove=ruleMove
	{ $current=$iv_ruleMove.current; }
	EOF;

// Rule Move
ruleMove returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Move'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
		}
		(
			(
				lv_distance_1_0=RULE_INT
				{
					newLeafNode(lv_distance_1_0, grammarAccess.getMoveAccess().getDistanceINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;