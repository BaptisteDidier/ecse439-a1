package org.xtext.example.cps.ide.contentassist.antlr.internal;

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
import org.xtext.example.cps.services.CpsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FALL'", "'WINTER'", "'BOTH'", "'student'", "'taken'", "'{'", "'}'", "'maxCreditsPerTerm'", "'program'", "'courses'", "'course'", "'credits'", "'term'", "'year'", "'prereq'", "','", "'coreq'", "'OR'", "'AND'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCpsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCpsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCpsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCps.g"; }


    	private CpsGrammarAccess grammarAccess;

    	public void setGrammarAccess(CpsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalCps.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCps.g:54:1: ( ruleModel EOF )
            // InternalCps.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCps.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalCps.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalCps.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalCps.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalCps.g:69:3: ( rule__Model__Group__0 )
            // InternalCps.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStudent"
    // InternalCps.g:78:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalCps.g:79:1: ( ruleStudent EOF )
            // InternalCps.g:80:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalCps.g:87:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:91:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalCps.g:92:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalCps.g:92:2: ( ( rule__Student__Group__0 ) )
            // InternalCps.g:93:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalCps.g:94:3: ( rule__Student__Group__0 )
            // InternalCps.g:94:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleProgram"
    // InternalCps.g:103:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalCps.g:104:1: ( ruleProgram EOF )
            // InternalCps.g:105:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCps.g:112:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:116:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalCps.g:117:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalCps.g:117:2: ( ( rule__Program__Group__0 ) )
            // InternalCps.g:118:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalCps.g:119:3: ( rule__Program__Group__0 )
            // InternalCps.g:119:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCourse"
    // InternalCps.g:128:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalCps.g:129:1: ( ruleCourse EOF )
            // InternalCps.g:130:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalCps.g:137:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:141:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalCps.g:142:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalCps.g:142:2: ( ( rule__Course__Group__0 ) )
            // InternalCps.g:143:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalCps.g:144:3: ( rule__Course__Group__0 )
            // InternalCps.g:144:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleExpr"
    // InternalCps.g:153:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalCps.g:154:1: ( ruleExpr EOF )
            // InternalCps.g:155:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalCps.g:162:1: ruleExpr : ( ruleOrExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:166:2: ( ( ruleOrExpr ) )
            // InternalCps.g:167:2: ( ruleOrExpr )
            {
            // InternalCps.g:167:2: ( ruleOrExpr )
            // InternalCps.g:168:3: ruleOrExpr
            {
             before(grammarAccess.getExprAccess().getOrExprParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getOrExprParserRuleCall()); 

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalCps.g:178:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // InternalCps.g:179:1: ( ruleOrExpr EOF )
            // InternalCps.g:180:1: ruleOrExpr EOF
            {
             before(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getOrExprRule()); 
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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalCps.g:187:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:191:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // InternalCps.g:192:2: ( ( rule__OrExpr__Group__0 ) )
            {
            // InternalCps.g:192:2: ( ( rule__OrExpr__Group__0 ) )
            // InternalCps.g:193:3: ( rule__OrExpr__Group__0 )
            {
             before(grammarAccess.getOrExprAccess().getGroup()); 
            // InternalCps.g:194:3: ( rule__OrExpr__Group__0 )
            // InternalCps.g:194:4: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalCps.g:203:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // InternalCps.g:204:1: ( ruleAndExpr EOF )
            // InternalCps.g:205:1: ruleAndExpr EOF
            {
             before(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getAndExprRule()); 
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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalCps.g:212:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:216:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // InternalCps.g:217:2: ( ( rule__AndExpr__Group__0 ) )
            {
            // InternalCps.g:217:2: ( ( rule__AndExpr__Group__0 ) )
            // InternalCps.g:218:3: ( rule__AndExpr__Group__0 )
            {
             before(grammarAccess.getAndExprAccess().getGroup()); 
            // InternalCps.g:219:3: ( rule__AndExpr__Group__0 )
            // InternalCps.g:219:4: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleAtom"
    // InternalCps.g:228:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalCps.g:229:1: ( ruleAtom EOF )
            // InternalCps.g:230:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalCps.g:237:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:241:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalCps.g:242:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalCps.g:242:2: ( ( rule__Atom__Alternatives ) )
            // InternalCps.g:243:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalCps.g:244:3: ( rule__Atom__Alternatives )
            // InternalCps.g:244:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "ruleTerm"
    // InternalCps.g:253:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:257:1: ( ( ( rule__Term__Alternatives ) ) )
            // InternalCps.g:258:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalCps.g:258:2: ( ( rule__Term__Alternatives ) )
            // InternalCps.g:259:3: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // InternalCps.g:260:3: ( rule__Term__Alternatives )
            // InternalCps.g:260:4: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalCps.g:268:1: rule__Atom__Alternatives : ( ( ( rule__Atom__CourseAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:272:1: ( ( ( rule__Atom__CourseAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCps.g:273:2: ( ( rule__Atom__CourseAssignment_0 ) )
                    {
                    // InternalCps.g:273:2: ( ( rule__Atom__CourseAssignment_0 ) )
                    // InternalCps.g:274:3: ( rule__Atom__CourseAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getCourseAssignment_0()); 
                    // InternalCps.g:275:3: ( rule__Atom__CourseAssignment_0 )
                    // InternalCps.g:275:4: rule__Atom__CourseAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__CourseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getCourseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCps.g:279:2: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // InternalCps.g:279:2: ( ( rule__Atom__Group_1__0 ) )
                    // InternalCps.g:280:3: ( rule__Atom__Group_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1()); 
                    // InternalCps.g:281:3: ( rule__Atom__Group_1__0 )
                    // InternalCps.g:281:4: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalCps.g:289:1: rule__Term__Alternatives : ( ( ( 'FALL' ) ) | ( ( 'WINTER' ) ) | ( ( 'BOTH' ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:293:1: ( ( ( 'FALL' ) ) | ( ( 'WINTER' ) ) | ( ( 'BOTH' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCps.g:294:2: ( ( 'FALL' ) )
                    {
                    // InternalCps.g:294:2: ( ( 'FALL' ) )
                    // InternalCps.g:295:3: ( 'FALL' )
                    {
                     before(grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0()); 
                    // InternalCps.g:296:3: ( 'FALL' )
                    // InternalCps.g:296:4: 'FALL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCps.g:300:2: ( ( 'WINTER' ) )
                    {
                    // InternalCps.g:300:2: ( ( 'WINTER' ) )
                    // InternalCps.g:301:3: ( 'WINTER' )
                    {
                     before(grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1()); 
                    // InternalCps.g:302:3: ( 'WINTER' )
                    // InternalCps.g:302:4: 'WINTER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCps.g:306:2: ( ( 'BOTH' ) )
                    {
                    // InternalCps.g:306:2: ( ( 'BOTH' ) )
                    // InternalCps.g:307:3: ( 'BOTH' )
                    {
                     before(grammarAccess.getTermAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalCps.g:308:3: ( 'BOTH' )
                    // InternalCps.g:308:4: 'BOTH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTermAccess().getBOTHEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalCps.g:316:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:320:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCps.g:321:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalCps.g:328:1: rule__Model__Group__0__Impl : ( ( rule__Model__ProgramAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:332:1: ( ( ( rule__Model__ProgramAssignment_0 ) ) )
            // InternalCps.g:333:1: ( ( rule__Model__ProgramAssignment_0 ) )
            {
            // InternalCps.g:333:1: ( ( rule__Model__ProgramAssignment_0 ) )
            // InternalCps.g:334:2: ( rule__Model__ProgramAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getProgramAssignment_0()); 
            // InternalCps.g:335:2: ( rule__Model__ProgramAssignment_0 )
            // InternalCps.g:335:3: rule__Model__ProgramAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProgramAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProgramAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalCps.g:343:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:347:1: ( rule__Model__Group__1__Impl )
            // InternalCps.g:348:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalCps.g:354:1: rule__Model__Group__1__Impl : ( ( rule__Model__StudentsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:358:1: ( ( ( rule__Model__StudentsAssignment_1 )* ) )
            // InternalCps.g:359:1: ( ( rule__Model__StudentsAssignment_1 )* )
            {
            // InternalCps.g:359:1: ( ( rule__Model__StudentsAssignment_1 )* )
            // InternalCps.g:360:2: ( rule__Model__StudentsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getStudentsAssignment_1()); 
            // InternalCps.g:361:2: ( rule__Model__StudentsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCps.g:361:3: rule__Model__StudentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__StudentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStudentsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // InternalCps.g:370:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:374:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalCps.g:375:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

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
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalCps.g:382:1: rule__Student__Group__0__Impl : ( 'student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:386:1: ( ( 'student' ) )
            // InternalCps.g:387:1: ( 'student' )
            {
            // InternalCps.g:387:1: ( 'student' )
            // InternalCps.g:388:2: 'student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

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
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalCps.g:397:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:401:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalCps.g:402:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

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
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalCps.g:409:1: rule__Student__Group__1__Impl : ( ( rule__Student__StudentNameAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:413:1: ( ( ( rule__Student__StudentNameAssignment_1 ) ) )
            // InternalCps.g:414:1: ( ( rule__Student__StudentNameAssignment_1 ) )
            {
            // InternalCps.g:414:1: ( ( rule__Student__StudentNameAssignment_1 ) )
            // InternalCps.g:415:2: ( rule__Student__StudentNameAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getStudentNameAssignment_1()); 
            // InternalCps.g:416:2: ( rule__Student__StudentNameAssignment_1 )
            // InternalCps.g:416:3: rule__Student__StudentNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__StudentNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getStudentNameAssignment_1()); 

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
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalCps.g:424:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:428:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalCps.g:429:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

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
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalCps.g:436:1: rule__Student__Group__2__Impl : ( 'taken' ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:440:1: ( ( 'taken' ) )
            // InternalCps.g:441:1: ( 'taken' )
            {
            // InternalCps.g:441:1: ( 'taken' )
            // InternalCps.g:442:2: 'taken'
            {
             before(grammarAccess.getStudentAccess().getTakenKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getTakenKeyword_2()); 

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
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalCps.g:451:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:455:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalCps.g:456:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

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
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalCps.g:463:1: rule__Student__Group__3__Impl : ( '{' ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:467:1: ( ( '{' ) )
            // InternalCps.g:468:1: ( '{' )
            {
            // InternalCps.g:468:1: ( '{' )
            // InternalCps.g:469:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalCps.g:478:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:482:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // InternalCps.g:483:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__5();

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
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalCps.g:490:1: rule__Student__Group__4__Impl : ( ( rule__Student__TakenCoursesAssignment_4 )* ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:494:1: ( ( ( rule__Student__TakenCoursesAssignment_4 )* ) )
            // InternalCps.g:495:1: ( ( rule__Student__TakenCoursesAssignment_4 )* )
            {
            // InternalCps.g:495:1: ( ( rule__Student__TakenCoursesAssignment_4 )* )
            // InternalCps.g:496:2: ( rule__Student__TakenCoursesAssignment_4 )*
            {
             before(grammarAccess.getStudentAccess().getTakenCoursesAssignment_4()); 
            // InternalCps.g:497:2: ( rule__Student__TakenCoursesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCps.g:497:3: rule__Student__TakenCoursesAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Student__TakenCoursesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getTakenCoursesAssignment_4()); 

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
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // InternalCps.g:505:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:509:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // InternalCps.g:510:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__6();

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
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // InternalCps.g:517:1: rule__Student__Group__5__Impl : ( '}' ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:521:1: ( ( '}' ) )
            // InternalCps.g:522:1: ( '}' )
            {
            // InternalCps.g:522:1: ( '}' )
            // InternalCps.g:523:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // InternalCps.g:532:1: rule__Student__Group__6 : rule__Student__Group__6__Impl rule__Student__Group__7 ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:536:1: ( rule__Student__Group__6__Impl rule__Student__Group__7 )
            // InternalCps.g:537:2: rule__Student__Group__6__Impl rule__Student__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Student__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__7();

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
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // InternalCps.g:544:1: rule__Student__Group__6__Impl : ( 'maxCreditsPerTerm' ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:548:1: ( ( 'maxCreditsPerTerm' ) )
            // InternalCps.g:549:1: ( 'maxCreditsPerTerm' )
            {
            // InternalCps.g:549:1: ( 'maxCreditsPerTerm' )
            // InternalCps.g:550:2: 'maxCreditsPerTerm'
            {
             before(grammarAccess.getStudentAccess().getMaxCreditsPerTermKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getMaxCreditsPerTermKeyword_6()); 

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
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group__7"
    // InternalCps.g:559:1: rule__Student__Group__7 : rule__Student__Group__7__Impl ;
    public final void rule__Student__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:563:1: ( rule__Student__Group__7__Impl )
            // InternalCps.g:564:2: rule__Student__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__7__Impl();

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
    // $ANTLR end "rule__Student__Group__7"


    // $ANTLR start "rule__Student__Group__7__Impl"
    // InternalCps.g:570:1: rule__Student__Group__7__Impl : ( ( rule__Student__MaxCreditsAssignment_7 ) ) ;
    public final void rule__Student__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:574:1: ( ( ( rule__Student__MaxCreditsAssignment_7 ) ) )
            // InternalCps.g:575:1: ( ( rule__Student__MaxCreditsAssignment_7 ) )
            {
            // InternalCps.g:575:1: ( ( rule__Student__MaxCreditsAssignment_7 ) )
            // InternalCps.g:576:2: ( rule__Student__MaxCreditsAssignment_7 )
            {
             before(grammarAccess.getStudentAccess().getMaxCreditsAssignment_7()); 
            // InternalCps.g:577:2: ( rule__Student__MaxCreditsAssignment_7 )
            // InternalCps.g:577:3: rule__Student__MaxCreditsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Student__MaxCreditsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getMaxCreditsAssignment_7()); 

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
    // $ANTLR end "rule__Student__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalCps.g:586:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:590:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCps.g:591:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalCps.g:598:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:602:1: ( ( 'program' ) )
            // InternalCps.g:603:1: ( 'program' )
            {
            // InternalCps.g:603:1: ( 'program' )
            // InternalCps.g:604:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalCps.g:613:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:617:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalCps.g:618:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalCps.g:625:1: rule__Program__Group__1__Impl : ( ( rule__Program__ProgramNameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:629:1: ( ( ( rule__Program__ProgramNameAssignment_1 ) ) )
            // InternalCps.g:630:1: ( ( rule__Program__ProgramNameAssignment_1 ) )
            {
            // InternalCps.g:630:1: ( ( rule__Program__ProgramNameAssignment_1 ) )
            // InternalCps.g:631:2: ( rule__Program__ProgramNameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getProgramNameAssignment_1()); 
            // InternalCps.g:632:2: ( rule__Program__ProgramNameAssignment_1 )
            // InternalCps.g:632:3: rule__Program__ProgramNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__ProgramNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getProgramNameAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalCps.g:640:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:644:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalCps.g:645:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalCps.g:652:1: rule__Program__Group__2__Impl : ( 'courses' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:656:1: ( ( 'courses' ) )
            // InternalCps.g:657:1: ( 'courses' )
            {
            // InternalCps.g:657:1: ( 'courses' )
            // InternalCps.g:658:2: 'courses'
            {
             before(grammarAccess.getProgramAccess().getCoursesKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCoursesKeyword_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalCps.g:667:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:671:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalCps.g:672:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalCps.g:679:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:683:1: ( ( '{' ) )
            // InternalCps.g:684:1: ( '{' )
            {
            // InternalCps.g:684:1: ( '{' )
            // InternalCps.g:685:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalCps.g:694:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:698:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalCps.g:699:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

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
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalCps.g:706:1: rule__Program__Group__4__Impl : ( ( rule__Program__CoursesAssignment_4 )* ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:710:1: ( ( ( rule__Program__CoursesAssignment_4 )* ) )
            // InternalCps.g:711:1: ( ( rule__Program__CoursesAssignment_4 )* )
            {
            // InternalCps.g:711:1: ( ( rule__Program__CoursesAssignment_4 )* )
            // InternalCps.g:712:2: ( rule__Program__CoursesAssignment_4 )*
            {
             before(grammarAccess.getProgramAccess().getCoursesAssignment_4()); 
            // InternalCps.g:713:2: ( rule__Program__CoursesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCps.g:713:3: rule__Program__CoursesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Program__CoursesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getCoursesAssignment_4()); 

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
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalCps.g:721:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:725:1: ( rule__Program__Group__5__Impl )
            // InternalCps.g:726:2: rule__Program__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__5__Impl();

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
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalCps.g:732:1: rule__Program__Group__5__Impl : ( '}' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:736:1: ( ( '}' ) )
            // InternalCps.g:737:1: ( '}' )
            {
            // InternalCps.g:737:1: ( '}' )
            // InternalCps.g:738:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // InternalCps.g:748:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:752:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalCps.g:753:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

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
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalCps.g:760:1: rule__Course__Group__0__Impl : ( 'course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:764:1: ( ( 'course' ) )
            // InternalCps.g:765:1: ( 'course' )
            {
            // InternalCps.g:765:1: ( 'course' )
            // InternalCps.g:766:2: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

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
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalCps.g:775:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:779:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalCps.g:780:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

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
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalCps.g:787:1: rule__Course__Group__1__Impl : ( ( rule__Course__CourseNameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:791:1: ( ( ( rule__Course__CourseNameAssignment_1 ) ) )
            // InternalCps.g:792:1: ( ( rule__Course__CourseNameAssignment_1 ) )
            {
            // InternalCps.g:792:1: ( ( rule__Course__CourseNameAssignment_1 ) )
            // InternalCps.g:793:2: ( rule__Course__CourseNameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getCourseNameAssignment_1()); 
            // InternalCps.g:794:2: ( rule__Course__CourseNameAssignment_1 )
            // InternalCps.g:794:3: rule__Course__CourseNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__CourseNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseNameAssignment_1()); 

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
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalCps.g:802:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:806:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalCps.g:807:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

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
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalCps.g:814:1: rule__Course__Group__2__Impl : ( ( rule__Course__CourseNumberAssignment_2 ) ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:818:1: ( ( ( rule__Course__CourseNumberAssignment_2 ) ) )
            // InternalCps.g:819:1: ( ( rule__Course__CourseNumberAssignment_2 ) )
            {
            // InternalCps.g:819:1: ( ( rule__Course__CourseNumberAssignment_2 ) )
            // InternalCps.g:820:2: ( rule__Course__CourseNumberAssignment_2 )
            {
             before(grammarAccess.getCourseAccess().getCourseNumberAssignment_2()); 
            // InternalCps.g:821:2: ( rule__Course__CourseNumberAssignment_2 )
            // InternalCps.g:821:3: rule__Course__CourseNumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Course__CourseNumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseNumberAssignment_2()); 

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
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalCps.g:829:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:833:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalCps.g:834:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

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
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalCps.g:841:1: rule__Course__Group__3__Impl : ( 'credits' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:845:1: ( ( 'credits' ) )
            // InternalCps.g:846:1: ( 'credits' )
            {
            // InternalCps.g:846:1: ( 'credits' )
            // InternalCps.g:847:2: 'credits'
            {
             before(grammarAccess.getCourseAccess().getCreditsKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCreditsKeyword_3()); 

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
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalCps.g:856:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:860:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalCps.g:861:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

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
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalCps.g:868:1: rule__Course__Group__4__Impl : ( ( rule__Course__CreditsAssignment_4 ) ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:872:1: ( ( ( rule__Course__CreditsAssignment_4 ) ) )
            // InternalCps.g:873:1: ( ( rule__Course__CreditsAssignment_4 ) )
            {
            // InternalCps.g:873:1: ( ( rule__Course__CreditsAssignment_4 ) )
            // InternalCps.g:874:2: ( rule__Course__CreditsAssignment_4 )
            {
             before(grammarAccess.getCourseAccess().getCreditsAssignment_4()); 
            // InternalCps.g:875:2: ( rule__Course__CreditsAssignment_4 )
            // InternalCps.g:875:3: rule__Course__CreditsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Course__CreditsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCreditsAssignment_4()); 

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
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalCps.g:883:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:887:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalCps.g:888:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

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
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalCps.g:895:1: rule__Course__Group__5__Impl : ( 'term' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:899:1: ( ( 'term' ) )
            // InternalCps.g:900:1: ( 'term' )
            {
            // InternalCps.g:900:1: ( 'term' )
            // InternalCps.g:901:2: 'term'
            {
             before(grammarAccess.getCourseAccess().getTermKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTermKeyword_5()); 

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
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalCps.g:910:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:914:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalCps.g:915:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

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
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalCps.g:922:1: rule__Course__Group__6__Impl : ( ( rule__Course__TermAssignment_6 ) ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:926:1: ( ( ( rule__Course__TermAssignment_6 ) ) )
            // InternalCps.g:927:1: ( ( rule__Course__TermAssignment_6 ) )
            {
            // InternalCps.g:927:1: ( ( rule__Course__TermAssignment_6 ) )
            // InternalCps.g:928:2: ( rule__Course__TermAssignment_6 )
            {
             before(grammarAccess.getCourseAccess().getTermAssignment_6()); 
            // InternalCps.g:929:2: ( rule__Course__TermAssignment_6 )
            // InternalCps.g:929:3: rule__Course__TermAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Course__TermAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTermAssignment_6()); 

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
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalCps.g:937:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:941:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // InternalCps.g:942:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__8();

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
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalCps.g:949:1: rule__Course__Group__7__Impl : ( 'year' ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:953:1: ( ( 'year' ) )
            // InternalCps.g:954:1: ( 'year' )
            {
            // InternalCps.g:954:1: ( 'year' )
            // InternalCps.g:955:2: 'year'
            {
             before(grammarAccess.getCourseAccess().getYearKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getYearKeyword_7()); 

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
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group__8"
    // InternalCps.g:964:1: rule__Course__Group__8 : rule__Course__Group__8__Impl rule__Course__Group__9 ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:968:1: ( rule__Course__Group__8__Impl rule__Course__Group__9 )
            // InternalCps.g:969:2: rule__Course__Group__8__Impl rule__Course__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Course__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__9();

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
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // InternalCps.g:976:1: rule__Course__Group__8__Impl : ( ( rule__Course__YearAssignment_8 ) ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:980:1: ( ( ( rule__Course__YearAssignment_8 ) ) )
            // InternalCps.g:981:1: ( ( rule__Course__YearAssignment_8 ) )
            {
            // InternalCps.g:981:1: ( ( rule__Course__YearAssignment_8 ) )
            // InternalCps.g:982:2: ( rule__Course__YearAssignment_8 )
            {
             before(grammarAccess.getCourseAccess().getYearAssignment_8()); 
            // InternalCps.g:983:2: ( rule__Course__YearAssignment_8 )
            // InternalCps.g:983:3: rule__Course__YearAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Course__YearAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getYearAssignment_8()); 

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
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group__9"
    // InternalCps.g:991:1: rule__Course__Group__9 : rule__Course__Group__9__Impl rule__Course__Group__10 ;
    public final void rule__Course__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:995:1: ( rule__Course__Group__9__Impl rule__Course__Group__10 )
            // InternalCps.g:996:2: rule__Course__Group__9__Impl rule__Course__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Course__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__10();

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
    // $ANTLR end "rule__Course__Group__9"


    // $ANTLR start "rule__Course__Group__9__Impl"
    // InternalCps.g:1003:1: rule__Course__Group__9__Impl : ( ( rule__Course__Group_9__0 )? ) ;
    public final void rule__Course__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1007:1: ( ( ( rule__Course__Group_9__0 )? ) )
            // InternalCps.g:1008:1: ( ( rule__Course__Group_9__0 )? )
            {
            // InternalCps.g:1008:1: ( ( rule__Course__Group_9__0 )? )
            // InternalCps.g:1009:2: ( rule__Course__Group_9__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_9()); 
            // InternalCps.g:1010:2: ( rule__Course__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCps.g:1010:3: rule__Course__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Course__Group__9__Impl"


    // $ANTLR start "rule__Course__Group__10"
    // InternalCps.g:1018:1: rule__Course__Group__10 : rule__Course__Group__10__Impl ;
    public final void rule__Course__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1022:1: ( rule__Course__Group__10__Impl )
            // InternalCps.g:1023:2: rule__Course__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__10__Impl();

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
    // $ANTLR end "rule__Course__Group__10"


    // $ANTLR start "rule__Course__Group__10__Impl"
    // InternalCps.g:1029:1: rule__Course__Group__10__Impl : ( ( rule__Course__Group_10__0 )? ) ;
    public final void rule__Course__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1033:1: ( ( ( rule__Course__Group_10__0 )? ) )
            // InternalCps.g:1034:1: ( ( rule__Course__Group_10__0 )? )
            {
            // InternalCps.g:1034:1: ( ( rule__Course__Group_10__0 )? )
            // InternalCps.g:1035:2: ( rule__Course__Group_10__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_10()); 
            // InternalCps.g:1036:2: ( rule__Course__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCps.g:1036:3: rule__Course__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Course__Group__10__Impl"


    // $ANTLR start "rule__Course__Group_9__0"
    // InternalCps.g:1045:1: rule__Course__Group_9__0 : rule__Course__Group_9__0__Impl rule__Course__Group_9__1 ;
    public final void rule__Course__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1049:1: ( rule__Course__Group_9__0__Impl rule__Course__Group_9__1 )
            // InternalCps.g:1050:2: rule__Course__Group_9__0__Impl rule__Course__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_9__1();

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
    // $ANTLR end "rule__Course__Group_9__0"


    // $ANTLR start "rule__Course__Group_9__0__Impl"
    // InternalCps.g:1057:1: rule__Course__Group_9__0__Impl : ( 'prereq' ) ;
    public final void rule__Course__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1061:1: ( ( 'prereq' ) )
            // InternalCps.g:1062:1: ( 'prereq' )
            {
            // InternalCps.g:1062:1: ( 'prereq' )
            // InternalCps.g:1063:2: 'prereq'
            {
             before(grammarAccess.getCourseAccess().getPrereqKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPrereqKeyword_9_0()); 

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
    // $ANTLR end "rule__Course__Group_9__0__Impl"


    // $ANTLR start "rule__Course__Group_9__1"
    // InternalCps.g:1072:1: rule__Course__Group_9__1 : rule__Course__Group_9__1__Impl rule__Course__Group_9__2 ;
    public final void rule__Course__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1076:1: ( rule__Course__Group_9__1__Impl rule__Course__Group_9__2 )
            // InternalCps.g:1077:2: rule__Course__Group_9__1__Impl rule__Course__Group_9__2
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_9__2();

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
    // $ANTLR end "rule__Course__Group_9__1"


    // $ANTLR start "rule__Course__Group_9__1__Impl"
    // InternalCps.g:1084:1: rule__Course__Group_9__1__Impl : ( ( rule__Course__PrerequisitesAssignment_9_1 ) ) ;
    public final void rule__Course__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1088:1: ( ( ( rule__Course__PrerequisitesAssignment_9_1 ) ) )
            // InternalCps.g:1089:1: ( ( rule__Course__PrerequisitesAssignment_9_1 ) )
            {
            // InternalCps.g:1089:1: ( ( rule__Course__PrerequisitesAssignment_9_1 ) )
            // InternalCps.g:1090:2: ( rule__Course__PrerequisitesAssignment_9_1 )
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesAssignment_9_1()); 
            // InternalCps.g:1091:2: ( rule__Course__PrerequisitesAssignment_9_1 )
            // InternalCps.g:1091:3: rule__Course__PrerequisitesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__PrerequisitesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPrerequisitesAssignment_9_1()); 

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
    // $ANTLR end "rule__Course__Group_9__1__Impl"


    // $ANTLR start "rule__Course__Group_9__2"
    // InternalCps.g:1099:1: rule__Course__Group_9__2 : rule__Course__Group_9__2__Impl ;
    public final void rule__Course__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1103:1: ( rule__Course__Group_9__2__Impl )
            // InternalCps.g:1104:2: rule__Course__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_9__2__Impl();

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
    // $ANTLR end "rule__Course__Group_9__2"


    // $ANTLR start "rule__Course__Group_9__2__Impl"
    // InternalCps.g:1110:1: rule__Course__Group_9__2__Impl : ( ( rule__Course__Group_9_2__0 )* ) ;
    public final void rule__Course__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1114:1: ( ( ( rule__Course__Group_9_2__0 )* ) )
            // InternalCps.g:1115:1: ( ( rule__Course__Group_9_2__0 )* )
            {
            // InternalCps.g:1115:1: ( ( rule__Course__Group_9_2__0 )* )
            // InternalCps.g:1116:2: ( rule__Course__Group_9_2__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_9_2()); 
            // InternalCps.g:1117:2: ( rule__Course__Group_9_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCps.g:1117:3: rule__Course__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Course__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_9_2()); 

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
    // $ANTLR end "rule__Course__Group_9__2__Impl"


    // $ANTLR start "rule__Course__Group_9_2__0"
    // InternalCps.g:1126:1: rule__Course__Group_9_2__0 : rule__Course__Group_9_2__0__Impl rule__Course__Group_9_2__1 ;
    public final void rule__Course__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1130:1: ( rule__Course__Group_9_2__0__Impl rule__Course__Group_9_2__1 )
            // InternalCps.g:1131:2: rule__Course__Group_9_2__0__Impl rule__Course__Group_9_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_9_2__1();

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
    // $ANTLR end "rule__Course__Group_9_2__0"


    // $ANTLR start "rule__Course__Group_9_2__0__Impl"
    // InternalCps.g:1138:1: rule__Course__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1142:1: ( ( ',' ) )
            // InternalCps.g:1143:1: ( ',' )
            {
            // InternalCps.g:1143:1: ( ',' )
            // InternalCps.g:1144:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_9_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_9_2_0()); 

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
    // $ANTLR end "rule__Course__Group_9_2__0__Impl"


    // $ANTLR start "rule__Course__Group_9_2__1"
    // InternalCps.g:1153:1: rule__Course__Group_9_2__1 : rule__Course__Group_9_2__1__Impl ;
    public final void rule__Course__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1157:1: ( rule__Course__Group_9_2__1__Impl )
            // InternalCps.g:1158:2: rule__Course__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_9_2__1__Impl();

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
    // $ANTLR end "rule__Course__Group_9_2__1"


    // $ANTLR start "rule__Course__Group_9_2__1__Impl"
    // InternalCps.g:1164:1: rule__Course__Group_9_2__1__Impl : ( ( rule__Course__PrerequisitesAssignment_9_2_1 ) ) ;
    public final void rule__Course__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1168:1: ( ( ( rule__Course__PrerequisitesAssignment_9_2_1 ) ) )
            // InternalCps.g:1169:1: ( ( rule__Course__PrerequisitesAssignment_9_2_1 ) )
            {
            // InternalCps.g:1169:1: ( ( rule__Course__PrerequisitesAssignment_9_2_1 ) )
            // InternalCps.g:1170:2: ( rule__Course__PrerequisitesAssignment_9_2_1 )
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesAssignment_9_2_1()); 
            // InternalCps.g:1171:2: ( rule__Course__PrerequisitesAssignment_9_2_1 )
            // InternalCps.g:1171:3: rule__Course__PrerequisitesAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__PrerequisitesAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPrerequisitesAssignment_9_2_1()); 

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
    // $ANTLR end "rule__Course__Group_9_2__1__Impl"


    // $ANTLR start "rule__Course__Group_10__0"
    // InternalCps.g:1180:1: rule__Course__Group_10__0 : rule__Course__Group_10__0__Impl rule__Course__Group_10__1 ;
    public final void rule__Course__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1184:1: ( rule__Course__Group_10__0__Impl rule__Course__Group_10__1 )
            // InternalCps.g:1185:2: rule__Course__Group_10__0__Impl rule__Course__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_10__1();

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
    // $ANTLR end "rule__Course__Group_10__0"


    // $ANTLR start "rule__Course__Group_10__0__Impl"
    // InternalCps.g:1192:1: rule__Course__Group_10__0__Impl : ( 'coreq' ) ;
    public final void rule__Course__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1196:1: ( ( 'coreq' ) )
            // InternalCps.g:1197:1: ( 'coreq' )
            {
            // InternalCps.g:1197:1: ( 'coreq' )
            // InternalCps.g:1198:2: 'coreq'
            {
             before(grammarAccess.getCourseAccess().getCoreqKeyword_10_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCoreqKeyword_10_0()); 

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
    // $ANTLR end "rule__Course__Group_10__0__Impl"


    // $ANTLR start "rule__Course__Group_10__1"
    // InternalCps.g:1207:1: rule__Course__Group_10__1 : rule__Course__Group_10__1__Impl rule__Course__Group_10__2 ;
    public final void rule__Course__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1211:1: ( rule__Course__Group_10__1__Impl rule__Course__Group_10__2 )
            // InternalCps.g:1212:2: rule__Course__Group_10__1__Impl rule__Course__Group_10__2
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_10__2();

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
    // $ANTLR end "rule__Course__Group_10__1"


    // $ANTLR start "rule__Course__Group_10__1__Impl"
    // InternalCps.g:1219:1: rule__Course__Group_10__1__Impl : ( ( rule__Course__CorequisitesAssignment_10_1 ) ) ;
    public final void rule__Course__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1223:1: ( ( ( rule__Course__CorequisitesAssignment_10_1 ) ) )
            // InternalCps.g:1224:1: ( ( rule__Course__CorequisitesAssignment_10_1 ) )
            {
            // InternalCps.g:1224:1: ( ( rule__Course__CorequisitesAssignment_10_1 ) )
            // InternalCps.g:1225:2: ( rule__Course__CorequisitesAssignment_10_1 )
            {
             before(grammarAccess.getCourseAccess().getCorequisitesAssignment_10_1()); 
            // InternalCps.g:1226:2: ( rule__Course__CorequisitesAssignment_10_1 )
            // InternalCps.g:1226:3: rule__Course__CorequisitesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__CorequisitesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCorequisitesAssignment_10_1()); 

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
    // $ANTLR end "rule__Course__Group_10__1__Impl"


    // $ANTLR start "rule__Course__Group_10__2"
    // InternalCps.g:1234:1: rule__Course__Group_10__2 : rule__Course__Group_10__2__Impl ;
    public final void rule__Course__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1238:1: ( rule__Course__Group_10__2__Impl )
            // InternalCps.g:1239:2: rule__Course__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_10__2__Impl();

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
    // $ANTLR end "rule__Course__Group_10__2"


    // $ANTLR start "rule__Course__Group_10__2__Impl"
    // InternalCps.g:1245:1: rule__Course__Group_10__2__Impl : ( ( rule__Course__Group_10_2__0 )* ) ;
    public final void rule__Course__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1249:1: ( ( ( rule__Course__Group_10_2__0 )* ) )
            // InternalCps.g:1250:1: ( ( rule__Course__Group_10_2__0 )* )
            {
            // InternalCps.g:1250:1: ( ( rule__Course__Group_10_2__0 )* )
            // InternalCps.g:1251:2: ( rule__Course__Group_10_2__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_10_2()); 
            // InternalCps.g:1252:2: ( rule__Course__Group_10_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCps.g:1252:3: rule__Course__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Course__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_10_2()); 

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
    // $ANTLR end "rule__Course__Group_10__2__Impl"


    // $ANTLR start "rule__Course__Group_10_2__0"
    // InternalCps.g:1261:1: rule__Course__Group_10_2__0 : rule__Course__Group_10_2__0__Impl rule__Course__Group_10_2__1 ;
    public final void rule__Course__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1265:1: ( rule__Course__Group_10_2__0__Impl rule__Course__Group_10_2__1 )
            // InternalCps.g:1266:2: rule__Course__Group_10_2__0__Impl rule__Course__Group_10_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_10_2__1();

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
    // $ANTLR end "rule__Course__Group_10_2__0"


    // $ANTLR start "rule__Course__Group_10_2__0__Impl"
    // InternalCps.g:1273:1: rule__Course__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1277:1: ( ( ',' ) )
            // InternalCps.g:1278:1: ( ',' )
            {
            // InternalCps.g:1278:1: ( ',' )
            // InternalCps.g:1279:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_10_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_10_2_0()); 

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
    // $ANTLR end "rule__Course__Group_10_2__0__Impl"


    // $ANTLR start "rule__Course__Group_10_2__1"
    // InternalCps.g:1288:1: rule__Course__Group_10_2__1 : rule__Course__Group_10_2__1__Impl ;
    public final void rule__Course__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1292:1: ( rule__Course__Group_10_2__1__Impl )
            // InternalCps.g:1293:2: rule__Course__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_10_2__1__Impl();

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
    // $ANTLR end "rule__Course__Group_10_2__1"


    // $ANTLR start "rule__Course__Group_10_2__1__Impl"
    // InternalCps.g:1299:1: rule__Course__Group_10_2__1__Impl : ( ( rule__Course__CorequisitesAssignment_10_2_1 ) ) ;
    public final void rule__Course__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1303:1: ( ( ( rule__Course__CorequisitesAssignment_10_2_1 ) ) )
            // InternalCps.g:1304:1: ( ( rule__Course__CorequisitesAssignment_10_2_1 ) )
            {
            // InternalCps.g:1304:1: ( ( rule__Course__CorequisitesAssignment_10_2_1 ) )
            // InternalCps.g:1305:2: ( rule__Course__CorequisitesAssignment_10_2_1 )
            {
             before(grammarAccess.getCourseAccess().getCorequisitesAssignment_10_2_1()); 
            // InternalCps.g:1306:2: ( rule__Course__CorequisitesAssignment_10_2_1 )
            // InternalCps.g:1306:3: rule__Course__CorequisitesAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__CorequisitesAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCorequisitesAssignment_10_2_1()); 

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
    // $ANTLR end "rule__Course__Group_10_2__1__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // InternalCps.g:1315:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1319:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // InternalCps.g:1320:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__1();

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
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // InternalCps.g:1327:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1331:1: ( ( ruleAndExpr ) )
            // InternalCps.g:1332:1: ( ruleAndExpr )
            {
            // InternalCps.g:1332:1: ( ruleAndExpr )
            // InternalCps.g:1333:2: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // InternalCps.g:1342:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1346:1: ( rule__OrExpr__Group__1__Impl )
            // InternalCps.g:1347:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // InternalCps.g:1353:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1357:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // InternalCps.g:1358:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // InternalCps.g:1358:1: ( ( rule__OrExpr__Group_1__0 )* )
            // InternalCps.g:1359:2: ( rule__OrExpr__Group_1__0 )*
            {
             before(grammarAccess.getOrExprAccess().getGroup_1()); 
            // InternalCps.g:1360:2: ( rule__OrExpr__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCps.g:1360:3: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOrExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // InternalCps.g:1369:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1373:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // InternalCps.g:1374:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__1();

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
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // InternalCps.g:1381:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1385:1: ( ( () ) )
            // InternalCps.g:1386:1: ( () )
            {
            // InternalCps.g:1386:1: ( () )
            // InternalCps.g:1387:2: ()
            {
             before(grammarAccess.getOrExprAccess().getOrLeftAction_1_0()); 
            // InternalCps.g:1388:2: ()
            // InternalCps.g:1388:3: 
            {
            }

             after(grammarAccess.getOrExprAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__1"
    // InternalCps.g:1396:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1400:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // InternalCps.g:1401:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__2();

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
    // $ANTLR end "rule__OrExpr__Group_1__1"


    // $ANTLR start "rule__OrExpr__Group_1__1__Impl"
    // InternalCps.g:1408:1: rule__OrExpr__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1412:1: ( ( 'OR' ) )
            // InternalCps.g:1413:1: ( 'OR' )
            {
            // InternalCps.g:1413:1: ( 'OR' )
            // InternalCps.g:1414:2: 'OR'
            {
             before(grammarAccess.getOrExprAccess().getORKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOrExprAccess().getORKeyword_1_1()); 

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
    // $ANTLR end "rule__OrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__2"
    // InternalCps.g:1423:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1427:1: ( rule__OrExpr__Group_1__2__Impl )
            // InternalCps.g:1428:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpr__Group_1__2"


    // $ANTLR start "rule__OrExpr__Group_1__2__Impl"
    // InternalCps.g:1434:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1438:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // InternalCps.g:1439:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // InternalCps.g:1439:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // InternalCps.g:1440:2: ( rule__OrExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            // InternalCps.g:1441:2: ( rule__OrExpr__RightAssignment_1_2 )
            // InternalCps.g:1441:3: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpr__Group__0"
    // InternalCps.g:1450:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1454:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // InternalCps.g:1455:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpr__Group__1();

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
    // $ANTLR end "rule__AndExpr__Group__0"


    // $ANTLR start "rule__AndExpr__Group__0__Impl"
    // InternalCps.g:1462:1: rule__AndExpr__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1466:1: ( ( ruleAtom ) )
            // InternalCps.g:1467:1: ( ruleAtom )
            {
            // InternalCps.g:1467:1: ( ruleAtom )
            // InternalCps.g:1468:2: ruleAtom
            {
             before(grammarAccess.getAndExprAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getAtomParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpr__Group__0__Impl"


    // $ANTLR start "rule__AndExpr__Group__1"
    // InternalCps.g:1477:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1481:1: ( rule__AndExpr__Group__1__Impl )
            // InternalCps.g:1482:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpr__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpr__Group__1"


    // $ANTLR start "rule__AndExpr__Group__1__Impl"
    // InternalCps.g:1488:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1492:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // InternalCps.g:1493:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // InternalCps.g:1493:1: ( ( rule__AndExpr__Group_1__0 )* )
            // InternalCps.g:1494:2: ( rule__AndExpr__Group_1__0 )*
            {
             before(grammarAccess.getAndExprAccess().getGroup_1()); 
            // InternalCps.g:1495:2: ( rule__AndExpr__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCps.g:1495:3: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpr__Group__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__0"
    // InternalCps.g:1504:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1508:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // InternalCps.g:1509:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpr__Group_1__1();

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
    // $ANTLR end "rule__AndExpr__Group_1__0"


    // $ANTLR start "rule__AndExpr__Group_1__0__Impl"
    // InternalCps.g:1516:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1520:1: ( ( () ) )
            // InternalCps.g:1521:1: ( () )
            {
            // InternalCps.g:1521:1: ( () )
            // InternalCps.g:1522:2: ()
            {
             before(grammarAccess.getAndExprAccess().getAndLeftAction_1_0()); 
            // InternalCps.g:1523:2: ()
            // InternalCps.g:1523:3: 
            {
            }

             after(grammarAccess.getAndExprAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__1"
    // InternalCps.g:1531:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1535:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // InternalCps.g:1536:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpr__Group_1__2();

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
    // $ANTLR end "rule__AndExpr__Group_1__1"


    // $ANTLR start "rule__AndExpr__Group_1__1__Impl"
    // InternalCps.g:1543:1: rule__AndExpr__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1547:1: ( ( 'AND' ) )
            // InternalCps.g:1548:1: ( 'AND' )
            {
            // InternalCps.g:1548:1: ( 'AND' )
            // InternalCps.g:1549:2: 'AND'
            {
             before(grammarAccess.getAndExprAccess().getANDKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAndExprAccess().getANDKeyword_1_1()); 

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
    // $ANTLR end "rule__AndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__2"
    // InternalCps.g:1558:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1562:1: ( rule__AndExpr__Group_1__2__Impl )
            // InternalCps.g:1563:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpr__Group_1__2"


    // $ANTLR start "rule__AndExpr__Group_1__2__Impl"
    // InternalCps.g:1569:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1573:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // InternalCps.g:1574:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // InternalCps.g:1574:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // InternalCps.g:1575:2: ( rule__AndExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            // InternalCps.g:1576:2: ( rule__AndExpr__RightAssignment_1_2 )
            // InternalCps.g:1576:3: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpr__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // InternalCps.g:1585:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1589:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalCps.g:1590:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__1();

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
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // InternalCps.g:1597:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1601:1: ( ( '(' ) )
            // InternalCps.g:1602:1: ( '(' )
            {
            // InternalCps.g:1602:1: ( '(' )
            // InternalCps.g:1603:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // InternalCps.g:1612:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1616:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalCps.g:1617:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2();

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
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // InternalCps.g:1624:1: rule__Atom__Group_1__1__Impl : ( ruleExpr ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1628:1: ( ( ruleExpr ) )
            // InternalCps.g:1629:1: ( ruleExpr )
            {
            // InternalCps.g:1629:1: ( ruleExpr )
            // InternalCps.g:1630:2: ruleExpr
            {
             before(grammarAccess.getAtomAccess().getExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getExprParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // InternalCps.g:1639:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1643:1: ( rule__Atom__Group_1__2__Impl )
            // InternalCps.g:1644:2: rule__Atom__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // InternalCps.g:1650:1: rule__Atom__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1654:1: ( ( ')' ) )
            // InternalCps.g:1655:1: ( ')' )
            {
            // InternalCps.g:1655:1: ( ')' )
            // InternalCps.g:1656:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ProgramAssignment_0"
    // InternalCps.g:1666:1: rule__Model__ProgramAssignment_0 : ( ruleProgram ) ;
    public final void rule__Model__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1670:1: ( ( ruleProgram ) )
            // InternalCps.g:1671:2: ( ruleProgram )
            {
            // InternalCps.g:1671:2: ( ruleProgram )
            // InternalCps.g:1672:3: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ProgramAssignment_0"


    // $ANTLR start "rule__Model__StudentsAssignment_1"
    // InternalCps.g:1681:1: rule__Model__StudentsAssignment_1 : ( ruleStudent ) ;
    public final void rule__Model__StudentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1685:1: ( ( ruleStudent ) )
            // InternalCps.g:1686:2: ( ruleStudent )
            {
            // InternalCps.g:1686:2: ( ruleStudent )
            // InternalCps.g:1687:3: ruleStudent
            {
             before(grammarAccess.getModelAccess().getStudentsStudentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStudentsStudentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__StudentsAssignment_1"


    // $ANTLR start "rule__Student__StudentNameAssignment_1"
    // InternalCps.g:1696:1: rule__Student__StudentNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Student__StudentNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1700:1: ( ( RULE_ID ) )
            // InternalCps.g:1701:2: ( RULE_ID )
            {
            // InternalCps.g:1701:2: ( RULE_ID )
            // InternalCps.g:1702:3: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getStudentNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Student__StudentNameAssignment_1"


    // $ANTLR start "rule__Student__TakenCoursesAssignment_4"
    // InternalCps.g:1711:1: rule__Student__TakenCoursesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Student__TakenCoursesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1715:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1716:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1716:2: ( ( RULE_ID ) )
            // InternalCps.g:1717:3: ( RULE_ID )
            {
             before(grammarAccess.getStudentAccess().getTakenCoursesCourseCrossReference_4_0()); 
            // InternalCps.g:1718:3: ( RULE_ID )
            // InternalCps.g:1719:4: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getTakenCoursesCourseIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getTakenCoursesCourseIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getTakenCoursesCourseCrossReference_4_0()); 

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
    // $ANTLR end "rule__Student__TakenCoursesAssignment_4"


    // $ANTLR start "rule__Student__MaxCreditsAssignment_7"
    // InternalCps.g:1730:1: rule__Student__MaxCreditsAssignment_7 : ( RULE_INT ) ;
    public final void rule__Student__MaxCreditsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1734:1: ( ( RULE_INT ) )
            // InternalCps.g:1735:2: ( RULE_INT )
            {
            // InternalCps.g:1735:2: ( RULE_INT )
            // InternalCps.g:1736:3: RULE_INT
            {
             before(grammarAccess.getStudentAccess().getMaxCreditsINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getMaxCreditsINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Student__MaxCreditsAssignment_7"


    // $ANTLR start "rule__Program__ProgramNameAssignment_1"
    // InternalCps.g:1745:1: rule__Program__ProgramNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__ProgramNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1749:1: ( ( RULE_ID ) )
            // InternalCps.g:1750:2: ( RULE_ID )
            {
            // InternalCps.g:1750:2: ( RULE_ID )
            // InternalCps.g:1751:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getProgramNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__ProgramNameAssignment_1"


    // $ANTLR start "rule__Program__CoursesAssignment_4"
    // InternalCps.g:1760:1: rule__Program__CoursesAssignment_4 : ( ruleCourse ) ;
    public final void rule__Program__CoursesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1764:1: ( ( ruleCourse ) )
            // InternalCps.g:1765:2: ( ruleCourse )
            {
            // InternalCps.g:1765:2: ( ruleCourse )
            // InternalCps.g:1766:3: ruleCourse
            {
             before(grammarAccess.getProgramAccess().getCoursesCourseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCoursesCourseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Program__CoursesAssignment_4"


    // $ANTLR start "rule__Course__CourseNameAssignment_1"
    // InternalCps.g:1775:1: rule__Course__CourseNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Course__CourseNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1779:1: ( ( RULE_ID ) )
            // InternalCps.g:1780:2: ( RULE_ID )
            {
            // InternalCps.g:1780:2: ( RULE_ID )
            // InternalCps.g:1781:3: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getCourseNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Course__CourseNameAssignment_1"


    // $ANTLR start "rule__Course__CourseNumberAssignment_2"
    // InternalCps.g:1790:1: rule__Course__CourseNumberAssignment_2 : ( RULE_ID ) ;
    public final void rule__Course__CourseNumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1794:1: ( ( RULE_ID ) )
            // InternalCps.g:1795:2: ( RULE_ID )
            {
            // InternalCps.g:1795:2: ( RULE_ID )
            // InternalCps.g:1796:3: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getCourseNumberIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseNumberIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Course__CourseNumberAssignment_2"


    // $ANTLR start "rule__Course__CreditsAssignment_4"
    // InternalCps.g:1805:1: rule__Course__CreditsAssignment_4 : ( RULE_INT ) ;
    public final void rule__Course__CreditsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1809:1: ( ( RULE_INT ) )
            // InternalCps.g:1810:2: ( RULE_INT )
            {
            // InternalCps.g:1810:2: ( RULE_INT )
            // InternalCps.g:1811:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getCreditsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCreditsINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Course__CreditsAssignment_4"


    // $ANTLR start "rule__Course__TermAssignment_6"
    // InternalCps.g:1820:1: rule__Course__TermAssignment_6 : ( ruleTerm ) ;
    public final void rule__Course__TermAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1824:1: ( ( ruleTerm ) )
            // InternalCps.g:1825:2: ( ruleTerm )
            {
            // InternalCps.g:1825:2: ( ruleTerm )
            // InternalCps.g:1826:3: ruleTerm
            {
             before(grammarAccess.getCourseAccess().getTermTermEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getTermTermEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Course__TermAssignment_6"


    // $ANTLR start "rule__Course__YearAssignment_8"
    // InternalCps.g:1835:1: rule__Course__YearAssignment_8 : ( RULE_INT ) ;
    public final void rule__Course__YearAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1839:1: ( ( RULE_INT ) )
            // InternalCps.g:1840:2: ( RULE_INT )
            {
            // InternalCps.g:1840:2: ( RULE_INT )
            // InternalCps.g:1841:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getYearINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getYearINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Course__YearAssignment_8"


    // $ANTLR start "rule__Course__PrerequisitesAssignment_9_1"
    // InternalCps.g:1850:1: rule__Course__PrerequisitesAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Course__PrerequisitesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1854:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1855:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1855:2: ( ( RULE_ID ) )
            // InternalCps.g:1856:3: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesExprCrossReference_9_1_0()); 
            // InternalCps.g:1857:3: ( RULE_ID )
            // InternalCps.g:1858:4: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesExprIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPrerequisitesExprIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getPrerequisitesExprCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__Course__PrerequisitesAssignment_9_1"


    // $ANTLR start "rule__Course__PrerequisitesAssignment_9_2_1"
    // InternalCps.g:1869:1: rule__Course__PrerequisitesAssignment_9_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Course__PrerequisitesAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1873:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1874:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1874:2: ( ( RULE_ID ) )
            // InternalCps.g:1875:3: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesExprCrossReference_9_2_1_0()); 
            // InternalCps.g:1876:3: ( RULE_ID )
            // InternalCps.g:1877:4: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getPrerequisitesExprIDTerminalRuleCall_9_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPrerequisitesExprIDTerminalRuleCall_9_2_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getPrerequisitesExprCrossReference_9_2_1_0()); 

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
    // $ANTLR end "rule__Course__PrerequisitesAssignment_9_2_1"


    // $ANTLR start "rule__Course__CorequisitesAssignment_10_1"
    // InternalCps.g:1888:1: rule__Course__CorequisitesAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Course__CorequisitesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1892:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1893:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1893:2: ( ( RULE_ID ) )
            // InternalCps.g:1894:3: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getCorequisitesExprCrossReference_10_1_0()); 
            // InternalCps.g:1895:3: ( RULE_ID )
            // InternalCps.g:1896:4: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getCorequisitesExprIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCorequisitesExprIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getCorequisitesExprCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__Course__CorequisitesAssignment_10_1"


    // $ANTLR start "rule__Course__CorequisitesAssignment_10_2_1"
    // InternalCps.g:1907:1: rule__Course__CorequisitesAssignment_10_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Course__CorequisitesAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1911:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1912:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1912:2: ( ( RULE_ID ) )
            // InternalCps.g:1913:3: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getCorequisitesExprCrossReference_10_2_1_0()); 
            // InternalCps.g:1914:3: ( RULE_ID )
            // InternalCps.g:1915:4: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getCorequisitesExprIDTerminalRuleCall_10_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCorequisitesExprIDTerminalRuleCall_10_2_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getCorequisitesExprCrossReference_10_2_1_0()); 

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
    // $ANTLR end "rule__Course__CorequisitesAssignment_10_2_1"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_2"
    // InternalCps.g:1926:1: rule__OrExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1930:1: ( ( ruleAndExpr ) )
            // InternalCps.g:1931:2: ( ruleAndExpr )
            {
            // InternalCps.g:1931:2: ( ruleAndExpr )
            // InternalCps.g:1932:3: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpr__RightAssignment_1_2"
    // InternalCps.g:1941:1: rule__AndExpr__RightAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1945:1: ( ( ruleAtom ) )
            // InternalCps.g:1946:2: ( ruleAtom )
            {
            // InternalCps.g:1946:2: ( ruleAtom )
            // InternalCps.g:1947:3: ruleAtom
            {
             before(grammarAccess.getAndExprAccess().getRightAtomParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getRightAtomParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpr__RightAssignment_1_2"


    // $ANTLR start "rule__Atom__CourseAssignment_0"
    // InternalCps.g:1956:1: rule__Atom__CourseAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Atom__CourseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCps.g:1960:1: ( ( ( RULE_ID ) ) )
            // InternalCps.g:1961:2: ( ( RULE_ID ) )
            {
            // InternalCps.g:1961:2: ( ( RULE_ID ) )
            // InternalCps.g:1962:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomAccess().getCourseCourseCrossReference_0_0()); 
            // InternalCps.g:1963:3: ( RULE_ID )
            // InternalCps.g:1964:4: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getCourseCourseIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getCourseCourseIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtomAccess().getCourseCourseCrossReference_0_0()); 

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
    // $ANTLR end "rule__Atom__CourseAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});

}