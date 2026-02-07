package org.xtext.example.cps.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.cps.services.CpsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'courses'", "'{'", "'}'", "'student'", "'taken'", "'maxCreditsPerTerm'", "'course'", "'credits'", "'term'", "'year'", "'prereq'", "'coreq'", "'OR'", "'AND'", "'('", "')'", "'FALL'", "'WINTER'", "'BOTH'"
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

        public InternalCpsParser(TokenStream input, CpsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Cps";
       	}

       	@Override
       	protected CpsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCps"
    // InternalCps.g:65:1: entryRuleCps returns [EObject current=null] : iv_ruleCps= ruleCps EOF ;
    public final EObject entryRuleCps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCps = null;


        try {
            // InternalCps.g:65:44: (iv_ruleCps= ruleCps EOF )
            // InternalCps.g:66:2: iv_ruleCps= ruleCps EOF
            {
             newCompositeNode(grammarAccess.getCpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCps=ruleCps();

            state._fsp--;

             current =iv_ruleCps; 
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
    // $ANTLR end "entryRuleCps"


    // $ANTLR start "ruleCps"
    // InternalCps.g:72:1: ruleCps returns [EObject current=null] : ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_students_1_0= ruleStudent ) )* ) ;
    public final EObject ruleCps() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;

        EObject lv_students_1_0 = null;



        	enterRule();

        try {
            // InternalCps.g:78:2: ( ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_students_1_0= ruleStudent ) )* ) )
            // InternalCps.g:79:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_students_1_0= ruleStudent ) )* )
            {
            // InternalCps.g:79:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_students_1_0= ruleStudent ) )* )
            // InternalCps.g:80:3: ( (lv_program_0_0= ruleProgram ) ) ( (lv_students_1_0= ruleStudent ) )*
            {
            // InternalCps.g:80:3: ( (lv_program_0_0= ruleProgram ) )
            // InternalCps.g:81:4: (lv_program_0_0= ruleProgram )
            {
            // InternalCps.g:81:4: (lv_program_0_0= ruleProgram )
            // InternalCps.g:82:5: lv_program_0_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getCpsAccess().getProgramProgramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCpsRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_0_0,
            						"org.xtext.example.cps.Cps.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCps.g:99:3: ( (lv_students_1_0= ruleStudent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCps.g:100:4: (lv_students_1_0= ruleStudent )
            	    {
            	    // InternalCps.g:100:4: (lv_students_1_0= ruleStudent )
            	    // InternalCps.g:101:5: lv_students_1_0= ruleStudent
            	    {

            	    					newCompositeNode(grammarAccess.getCpsAccess().getStudentsStudentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_students_1_0=ruleStudent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCpsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"students",
            	    						lv_students_1_0,
            	    						"org.xtext.example.cps.Cps.Student");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleCps"


    // $ANTLR start "entryRuleProgram"
    // InternalCps.g:122:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCps.g:122:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCps.g:123:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCps.g:129:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_courses_4_0 = null;



        	enterRule();

        try {
            // InternalCps.g:135:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' ) )
            // InternalCps.g:136:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' )
            {
            // InternalCps.g:136:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' )
            // InternalCps.g:137:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalCps.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCps.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCps.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalCps.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getCoursesKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCps.g:167:3: ( (lv_courses_4_0= ruleCourse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCps.g:168:4: (lv_courses_4_0= ruleCourse )
            	    {
            	    // InternalCps.g:168:4: (lv_courses_4_0= ruleCourse )
            	    // InternalCps.g:169:5: lv_courses_4_0= ruleCourse
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getCoursesCourseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_courses_4_0=ruleCourse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"courses",
            	    						lv_courses_4_0,
            	    						"org.xtext.example.cps.Cps.Course");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStudent"
    // InternalCps.g:194:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalCps.g:194:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalCps.g:195:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalCps.g:201:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_maxCredits_7_0=null;


        	enterRule();

        try {
            // InternalCps.g:207:2: ( (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) ) )
            // InternalCps.g:208:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) )
            {
            // InternalCps.g:208:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) )
            // InternalCps.g:209:3: otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalCps.g:213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCps.g:214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCps.g:214:4: (lv_name_1_0= RULE_ID )
            // InternalCps.g:215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStudentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getTakenKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCps.g:239:3: ( (otherlv_4= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCps.g:240:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalCps.g:240:4: (otherlv_4= RULE_ID )
            	    // InternalCps.g:241:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStudentRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getStudentAccess().getTakenCoursesCourseCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getStudentAccess().getMaxCreditsPerTermKeyword_6());
            		
            // InternalCps.g:260:3: ( (lv_maxCredits_7_0= RULE_INT ) )
            // InternalCps.g:261:4: (lv_maxCredits_7_0= RULE_INT )
            {
            // InternalCps.g:261:4: (lv_maxCredits_7_0= RULE_INT )
            // InternalCps.g:262:5: lv_maxCredits_7_0= RULE_INT
            {
            lv_maxCredits_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_maxCredits_7_0, grammarAccess.getStudentAccess().getMaxCreditsINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxCredits",
            						lv_maxCredits_7_0,
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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleCourse"
    // InternalCps.g:282:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalCps.g:282:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalCps.g:283:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalCps.g:289:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_ID ) ) otherlv_3= 'credits' ( (lv_credits_4_0= RULE_INT ) ) otherlv_5= 'term' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= 'year' ( (lv_year_8_0= RULE_INT ) ) (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )? (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )? ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_number_2_0=null;
        Token otherlv_3=null;
        Token lv_credits_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_year_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_term_6_0 = null;

        EObject lv_prereq_10_0 = null;

        EObject lv_coreq_12_0 = null;



        	enterRule();

        try {
            // InternalCps.g:295:2: ( (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_ID ) ) otherlv_3= 'credits' ( (lv_credits_4_0= RULE_INT ) ) otherlv_5= 'term' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= 'year' ( (lv_year_8_0= RULE_INT ) ) (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )? (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )? ) )
            // InternalCps.g:296:2: (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_ID ) ) otherlv_3= 'credits' ( (lv_credits_4_0= RULE_INT ) ) otherlv_5= 'term' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= 'year' ( (lv_year_8_0= RULE_INT ) ) (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )? (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )? )
            {
            // InternalCps.g:296:2: (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_ID ) ) otherlv_3= 'credits' ( (lv_credits_4_0= RULE_INT ) ) otherlv_5= 'term' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= 'year' ( (lv_year_8_0= RULE_INT ) ) (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )? (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )? )
            // InternalCps.g:297:3: otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= RULE_ID ) ) otherlv_3= 'credits' ( (lv_credits_4_0= RULE_INT ) ) otherlv_5= 'term' ( (lv_term_6_0= ruleTerm ) ) otherlv_7= 'year' ( (lv_year_8_0= RULE_INT ) ) (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )? (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalCps.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCps.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCps.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalCps.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCps.g:319:3: ( (lv_number_2_0= RULE_ID ) )
            // InternalCps.g:320:4: (lv_number_2_0= RULE_ID )
            {
            // InternalCps.g:320:4: (lv_number_2_0= RULE_ID )
            // InternalCps.g:321:5: lv_number_2_0= RULE_ID
            {
            lv_number_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_number_2_0, grammarAccess.getCourseAccess().getNumberIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getCreditsKeyword_3());
            		
            // InternalCps.g:341:3: ( (lv_credits_4_0= RULE_INT ) )
            // InternalCps.g:342:4: (lv_credits_4_0= RULE_INT )
            {
            // InternalCps.g:342:4: (lv_credits_4_0= RULE_INT )
            // InternalCps.g:343:5: lv_credits_4_0= RULE_INT
            {
            lv_credits_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_credits_4_0, grammarAccess.getCourseAccess().getCreditsINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"credits",
            						lv_credits_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getTermKeyword_5());
            		
            // InternalCps.g:363:3: ( (lv_term_6_0= ruleTerm ) )
            // InternalCps.g:364:4: (lv_term_6_0= ruleTerm )
            {
            // InternalCps.g:364:4: (lv_term_6_0= ruleTerm )
            // InternalCps.g:365:5: lv_term_6_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getTermTermEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_term_6_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_6_0,
            						"org.xtext.example.cps.Cps.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCourseAccess().getYearKeyword_7());
            		
            // InternalCps.g:386:3: ( (lv_year_8_0= RULE_INT ) )
            // InternalCps.g:387:4: (lv_year_8_0= RULE_INT )
            {
            // InternalCps.g:387:4: (lv_year_8_0= RULE_INT )
            // InternalCps.g:388:5: lv_year_8_0= RULE_INT
            {
            lv_year_8_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_year_8_0, grammarAccess.getCourseAccess().getYearINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCps.g:404:3: (otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCps.g:405:4: otherlv_9= 'prereq' ( (lv_prereq_10_0= ruleExpr ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getCourseAccess().getPrereqKeyword_9_0());
                    			
                    // InternalCps.g:409:4: ( (lv_prereq_10_0= ruleExpr ) )
                    // InternalCps.g:410:5: (lv_prereq_10_0= ruleExpr )
                    {
                    // InternalCps.g:410:5: (lv_prereq_10_0= ruleExpr )
                    // InternalCps.g:411:6: lv_prereq_10_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getPrereqExprParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_prereq_10_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"prereq",
                    							lv_prereq_10_0,
                    							"org.xtext.example.cps.Cps.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCps.g:429:3: (otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCps.g:430:4: otherlv_11= 'coreq' ( (lv_coreq_12_0= ruleExpr ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getCoreqKeyword_10_0());
                    			
                    // InternalCps.g:434:4: ( (lv_coreq_12_0= ruleExpr ) )
                    // InternalCps.g:435:5: (lv_coreq_12_0= ruleExpr )
                    {
                    // InternalCps.g:435:5: (lv_coreq_12_0= ruleExpr )
                    // InternalCps.g:436:6: lv_coreq_12_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getCoreqExprParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_coreq_12_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"coreq",
                    							lv_coreq_12_0,
                    							"org.xtext.example.cps.Cps.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleExpr"
    // InternalCps.g:458:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalCps.g:458:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalCps.g:459:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalCps.g:465:1: ruleExpr returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalCps.g:471:2: (this_OrExpr_0= ruleOrExpr )
            // InternalCps.g:472:2: this_OrExpr_0= ruleOrExpr
            {

            		newCompositeNode(grammarAccess.getExprAccess().getOrExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;


            		current = this_OrExpr_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalCps.g:483:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalCps.g:483:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalCps.g:484:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalCps.g:490:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCps.g:496:2: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalCps.g:497:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalCps.g:497:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalCps.g:498:3: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCps.g:506:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCps.g:507:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalCps.g:507:4: ()
            	    // InternalCps.g:508:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExprAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getORKeyword_1_1());
            	    			
            	    // InternalCps.g:518:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalCps.g:519:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalCps.g:519:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalCps.g:520:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.cps.Cps.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalCps.g:542:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalCps.g:542:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalCps.g:543:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalCps.g:549:1: ruleAndExpr returns [EObject current=null] : (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCps.g:555:2: ( (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalCps.g:556:2: (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalCps.g:556:2: (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalCps.g:557:3: this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCps.g:565:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCps.g:566:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalCps.g:566:4: ()
            	    // InternalCps.g:567:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getANDKeyword_1_1());
            	    			
            	    // InternalCps.g:577:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalCps.g:578:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalCps.g:578:5: (lv_right_3_0= ruleAtom )
            	    // InternalCps.g:579:6: lv_right_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightAtomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.cps.Cps.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleAtom"
    // InternalCps.g:601:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalCps.g:601:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalCps.g:602:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalCps.g:608:1: ruleAtom returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Expr_2 = null;



        	enterRule();

        try {
            // InternalCps.g:614:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) )
            // InternalCps.g:615:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            {
            // InternalCps.g:615:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCps.g:616:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalCps.g:616:3: ( (otherlv_0= RULE_ID ) )
                    // InternalCps.g:617:4: (otherlv_0= RULE_ID )
                    {
                    // InternalCps.g:617:4: (otherlv_0= RULE_ID )
                    // InternalCps.g:618:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getCourseCourseCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCps.g:630:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    {
                    // InternalCps.g:630:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    // InternalCps.g:631:4: otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_Expr_2=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "ruleTerm"
    // InternalCps.g:652:1: ruleTerm returns [Enumerator current=null] : ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) ) ;
    public final Enumerator ruleTerm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCps.g:658:2: ( ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) ) )
            // InternalCps.g:659:2: ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) )
            {
            // InternalCps.g:659:2: ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCps.g:660:3: (enumLiteral_0= 'FALL' )
                    {
                    // InternalCps.g:660:3: (enumLiteral_0= 'FALL' )
                    // InternalCps.g:661:4: enumLiteral_0= 'FALL'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCps.g:668:3: (enumLiteral_1= 'WINTER' )
                    {
                    // InternalCps.g:668:3: (enumLiteral_1= 'WINTER' )
                    // InternalCps.g:669:4: enumLiteral_1= 'WINTER'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCps.g:676:3: (enumLiteral_2= 'BOTH' )
                    {
                    // InternalCps.g:676:3: (enumLiteral_2= 'BOTH' )
                    // InternalCps.g:677:4: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTermAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTermAccess().getBOTHEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleTerm"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});

}