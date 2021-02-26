/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getActionsAccess().getAlternatives(), "rule__Actions__Alternatives");
			builder.put(grammarAccess.getRestAccess().getAlternatives(), "rule__Rest__Alternatives");
			builder.put(grammarAccess.getCharacterActionAccess().getGroup(), "rule__CharacterAction__Group__0");
			builder.put(grammarAccess.getLongRestAccess().getGroup(), "rule__LongRest__Group__0");
			builder.put(grammarAccess.getShortRestAccess().getGroup(), "rule__ShortRest__Group__0");
			builder.put(grammarAccess.getSpellAccess().getGroup(), "rule__Spell__Group__0");
			builder.put(grammarAccess.getAttackAccess().getGroup(), "rule__Attack__Group__0");
			builder.put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
			builder.put(grammarAccess.getHistoryAccess().getActionlistAssignment(), "rule__History__ActionlistAssignment");
			builder.put(grammarAccess.getCharacterActionAccess().getNameAssignment_1(), "rule__CharacterAction__NameAssignment_1");
			builder.put(grammarAccess.getCharacterActionAccess().getActionsAssignment_2(), "rule__CharacterAction__ActionsAssignment_2");
			builder.put(grammarAccess.getLongRestAccess().getLevelAssignment_1(), "rule__LongRest__LevelAssignment_1");
			builder.put(grammarAccess.getShortRestAccess().getHealingAssignment_1(), "rule__ShortRest__HealingAssignment_1");
			builder.put(grammarAccess.getSpellAccess().getNameAssignment_1(), "rule__Spell__NameAssignment_1");
			builder.put(grammarAccess.getSpellAccess().getLevelAssignment_2(), "rule__Spell__LevelAssignment_2");
			builder.put(grammarAccess.getAttackAccess().getDamageAssignment_1(), "rule__Attack__DamageAssignment_1");
			builder.put(grammarAccess.getMoveAccess().getDistanceAssignment_1(), "rule__Move__DistanceAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}