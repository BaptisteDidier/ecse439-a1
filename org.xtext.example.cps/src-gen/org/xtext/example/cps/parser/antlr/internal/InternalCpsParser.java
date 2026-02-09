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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'courses'", "'{'", "'}'", "'students'", "'student'", "'taken'", "'maxCreditsPerTerm'", "'course'", "'credits'", "'offered'", "'year'", "'prereq'", "'coreq'", "'OR'", "'AND'", "'('", "')'", "'FALL'", "'WINTER'", "'BOTH'"
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
    // InternalCps.g:72:1: ruleCps returns [EObject current=null] : ( (lv_program_0_0= ruleProgram ) ) ;
    public final EObject ruleCps() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalCps.g:78:2: ( ( (lv_program_0_0= ruleProgram ) ) )
            // InternalCps.g:79:2: ( (lv_program_0_0= ruleProgram ) )
            {
            // InternalCps.g:79:2: ( (lv_program_0_0= ruleProgram ) )
            // InternalCps.g:80:3: (lv_program_0_0= ruleProgram )
            {
            // InternalCps.g:80:3: (lv_program_0_0= ruleProgram )
            // InternalCps.g:81:4: lv_program_0_0= ruleProgram
            {

            				newCompositeNode(grammarAccess.getCpsAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
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
    // InternalCps.g:101:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCps.g:101:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCps.g:102:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalCps.g:108:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'students' otherlv_7= '{' ( (lv_students_8_0= ruleStudent ) )* otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_courses_4_0 = null;

        EObject lv_students_8_0 = null;



        	enterRule();

        try {
            // InternalCps.g:114:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'students' otherlv_7= '{' ( (lv_students_8_0= ruleStudent ) )* otherlv_9= '}' ) )
            // InternalCps.g:115:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'students' otherlv_7= '{' ( (lv_students_8_0= ruleStudent ) )* otherlv_9= '}' )
            {
            // InternalCps.g:115:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'students' otherlv_7= '{' ( (lv_students_8_0= ruleStudent ) )* otherlv_9= '}' )
            // InternalCps.g:116:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'courses' otherlv_3= '{' ( (lv_courses_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'students' otherlv_7= '{' ( (lv_students_8_0= ruleStudent ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalCps.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCps.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCps.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalCps.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getCoursesKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCps.g:146:3: ( (lv_courses_4_0= ruleCourse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCps.g:147:4: (lv_courses_4_0= ruleCourse )
            	    {
            	    // InternalCps.g:147:4: (lv_courses_4_0= ruleCourse )
            	    // InternalCps.g:148:5: lv_courses_4_0= ruleCourse
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getCoursesCourseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getStudentsKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalCps.g:177:3: ( (lv_students_8_0= ruleStudent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCps.g:178:4: (lv_students_8_0= ruleStudent )
            	    {
            	    // InternalCps.g:178:4: (lv_students_8_0= ruleStudent )
            	    // InternalCps.g:179:5: lv_students_8_0= ruleStudent
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStudentsStudentParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_students_8_0=ruleStudent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"students",
            	    						lv_students_8_0,
            	    						"org.xtext.example.cps.Cps.Student");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalCps.g:204:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalCps.g:204:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalCps.g:205:2: iv_ruleStudent= ruleStudent EOF
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
    // InternalCps.g:211:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (lv_taken_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_maxCredits_7_0=null;
        EObject lv_taken_4_0 = null;



        	enterRule();

        try {
            // InternalCps.g:217:2: ( (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (lv_taken_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) ) )
            // InternalCps.g:218:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (lv_taken_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) )
            {
            // InternalCps.g:218:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (lv_taken_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) ) )
            // InternalCps.g:219:3: otherlv_0= 'student' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'taken' otherlv_3= '{' ( (lv_taken_4_0= ruleCourse ) )* otherlv_5= '}' otherlv_6= 'maxCreditsPerTerm' ( (lv_maxCredits_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalCps.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCps.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCps.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalCps.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getTakenKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCps.g:249:3: ( (lv_taken_4_0= ruleCourse ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCps.g:250:4: (lv_taken_4_0= ruleCourse )
            	    {
            	    // InternalCps.g:250:4: (lv_taken_4_0= ruleCourse )
            	    // InternalCps.g:251:5: lv_taken_4_0= ruleCourse
            	    {

            	    					newCompositeNode(grammarAccess.getStudentAccess().getTakenCourseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_taken_4_0=ruleCourse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStudentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taken",
            	    						lv_taken_4_0,
            	    						"org.xtext.example.cps.Cps.Course");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getStudentAccess().getMaxCreditsPerTermKeyword_6());
            		
            // InternalCps.g:276:3: ( (lv_maxCredits_7_0= RULE_INT ) )
            // InternalCps.g:277:4: (lv_maxCredits_7_0= RULE_INT )
            {
            // InternalCps.g:277:4: (lv_maxCredits_7_0= RULE_INT )
            // InternalCps.g:278:5: lv_maxCredits_7_0= RULE_INT
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
    // InternalCps.g:298:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalCps.g:298:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalCps.g:299:2: iv_ruleCourse= ruleCourse EOF
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
    // InternalCps.g:305:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'course' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= 'credits' ( (lv_credits_3_0= RULE_INT ) ) otherlv_4= 'offered' ( (lv_offered_5_0= ruleTerm ) ) otherlv_6= 'year' ( (lv_year_7_0= RULE_INT ) ) (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )? (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )? ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;
        Token lv_credits_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_year_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_offered_5_0 = null;

        EObject lv_prereq_9_0 = null;

        EObject lv_coreq_11_0 = null;



        	enterRule();

        try {
            // InternalCps.g:311:2: ( (otherlv_0= 'course' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= 'credits' ( (lv_credits_3_0= RULE_INT ) ) otherlv_4= 'offered' ( (lv_offered_5_0= ruleTerm ) ) otherlv_6= 'year' ( (lv_year_7_0= RULE_INT ) ) (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )? (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )? ) )
            // InternalCps.g:312:2: (otherlv_0= 'course' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= 'credits' ( (lv_credits_3_0= RULE_INT ) ) otherlv_4= 'offered' ( (lv_offered_5_0= ruleTerm ) ) otherlv_6= 'year' ( (lv_year_7_0= RULE_INT ) ) (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )? (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )? )
            {
            // InternalCps.g:312:2: (otherlv_0= 'course' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= 'credits' ( (lv_credits_3_0= RULE_INT ) ) otherlv_4= 'offered' ( (lv_offered_5_0= ruleTerm ) ) otherlv_6= 'year' ( (lv_year_7_0= RULE_INT ) ) (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )? (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )? )
            // InternalCps.g:313:3: otherlv_0= 'course' ( (lv_code_1_0= RULE_ID ) ) otherlv_2= 'credits' ( (lv_credits_3_0= RULE_INT ) ) otherlv_4= 'offered' ( (lv_offered_5_0= ruleTerm ) ) otherlv_6= 'year' ( (lv_year_7_0= RULE_INT ) ) (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )? (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalCps.g:317:3: ( (lv_code_1_0= RULE_ID ) )
            // InternalCps.g:318:4: (lv_code_1_0= RULE_ID )
            {
            // InternalCps.g:318:4: (lv_code_1_0= RULE_ID )
            // InternalCps.g:319:5: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_code_1_0, grammarAccess.getCourseAccess().getCodeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getCreditsKeyword_2());
            		
            // InternalCps.g:339:3: ( (lv_credits_3_0= RULE_INT ) )
            // InternalCps.g:340:4: (lv_credits_3_0= RULE_INT )
            {
            // InternalCps.g:340:4: (lv_credits_3_0= RULE_INT )
            // InternalCps.g:341:5: lv_credits_3_0= RULE_INT
            {
            lv_credits_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_credits_3_0, grammarAccess.getCourseAccess().getCreditsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"credits",
            						lv_credits_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getOfferedKeyword_4());
            		
            // InternalCps.g:361:3: ( (lv_offered_5_0= ruleTerm ) )
            // InternalCps.g:362:4: (lv_offered_5_0= ruleTerm )
            {
            // InternalCps.g:362:4: (lv_offered_5_0= ruleTerm )
            // InternalCps.g:363:5: lv_offered_5_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getOfferedTermEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_offered_5_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"offered",
            						lv_offered_5_0,
            						"org.xtext.example.cps.Cps.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getYearKeyword_6());
            		
            // InternalCps.g:384:3: ( (lv_year_7_0= RULE_INT ) )
            // InternalCps.g:385:4: (lv_year_7_0= RULE_INT )
            {
            // InternalCps.g:385:4: (lv_year_7_0= RULE_INT )
            // InternalCps.g:386:5: lv_year_7_0= RULE_INT
            {
            lv_year_7_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_year_7_0, grammarAccess.getCourseAccess().getYearINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCps.g:402:3: (otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCps.g:403:4: otherlv_8= 'prereq' ( (lv_prereq_9_0= ruleExpr ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getPrereqKeyword_8_0());
                    			
                    // InternalCps.g:407:4: ( (lv_prereq_9_0= ruleExpr ) )
                    // InternalCps.g:408:5: (lv_prereq_9_0= ruleExpr )
                    {
                    // InternalCps.g:408:5: (lv_prereq_9_0= ruleExpr )
                    // InternalCps.g:409:6: lv_prereq_9_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getPrereqExprParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_prereq_9_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"prereq",
                    							lv_prereq_9_0,
                    							"org.xtext.example.cps.Cps.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCps.g:427:3: (otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCps.g:428:4: otherlv_10= 'coreq' ( (lv_coreq_11_0= ruleExpr ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getCoreqKeyword_9_0());
                    			
                    // InternalCps.g:432:4: ( (lv_coreq_11_0= ruleExpr ) )
                    // InternalCps.g:433:5: (lv_coreq_11_0= ruleExpr )
                    {
                    // InternalCps.g:433:5: (lv_coreq_11_0= ruleExpr )
                    // InternalCps.g:434:6: lv_coreq_11_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getCoreqExprParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_coreq_11_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						set(
                    							current,
                    							"coreq",
                    							lv_coreq_11_0,
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
    // InternalCps.g:456:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalCps.g:456:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalCps.g:457:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalCps.g:463:1: ruleExpr returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalCps.g:469:2: (this_Or_0= ruleOr )
            // InternalCps.g:470:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExprAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
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


    // $ANTLR start "entryRuleOr"
    // InternalCps.g:481:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCps.g:481:43: (iv_ruleOr= ruleOr EOF )
            // InternalCps.g:482:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCps.g:488:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCps.g:494:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCps.g:495:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCps.g:495:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCps.g:496:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCps.g:504:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCps.g:505:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCps.g:505:4: ()
            	    // InternalCps.g:506:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalCps.g:516:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCps.g:517:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCps.g:517:5: (lv_right_3_0= ruleAnd )
            	    // InternalCps.g:518:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.cps.Cps.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCps.g:540:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCps.g:540:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCps.g:541:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCps.g:547:1: ruleAnd returns [EObject current=null] : (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCps.g:553:2: ( (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalCps.g:554:2: (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalCps.g:554:2: (this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalCps.g:555:3: this_Atom_0= ruleAtom ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCps.g:563:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCps.g:564:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalCps.g:564:4: ()
            	    // InternalCps.g:565:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalCps.g:575:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalCps.g:576:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalCps.g:576:5: (lv_right_3_0= ruleAtom )
            	    // InternalCps.g:577:6: lv_right_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightAtomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAtom"
    // InternalCps.g:599:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalCps.g:599:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalCps.g:600:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalCps.g:606:1: ruleAtom returns [EObject current=null] : (this_CourseRef_0= ruleCourseRef | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_CourseRef_0 = null;

        EObject this_Expr_2 = null;



        	enterRule();

        try {
            // InternalCps.g:612:2: ( (this_CourseRef_0= ruleCourseRef | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) ) )
            // InternalCps.g:613:2: (this_CourseRef_0= ruleCourseRef | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            {
            // InternalCps.g:613:2: (this_CourseRef_0= ruleCourseRef | (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCps.g:614:3: this_CourseRef_0= ruleCourseRef
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getCourseRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CourseRef_0=ruleCourseRef();

                    state._fsp--;


                    			current = this_CourseRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCps.g:623:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    {
                    // InternalCps.g:623:3: (otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')' )
                    // InternalCps.g:624:4: otherlv_1= '(' this_Expr_2= ruleExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_Expr_2=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCourseRef"
    // InternalCps.g:645:1: entryRuleCourseRef returns [EObject current=null] : iv_ruleCourseRef= ruleCourseRef EOF ;
    public final EObject entryRuleCourseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseRef = null;


        try {
            // InternalCps.g:645:50: (iv_ruleCourseRef= ruleCourseRef EOF )
            // InternalCps.g:646:2: iv_ruleCourseRef= ruleCourseRef EOF
            {
             newCompositeNode(grammarAccess.getCourseRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourseRef=ruleCourseRef();

            state._fsp--;

             current =iv_ruleCourseRef; 
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
    // $ANTLR end "entryRuleCourseRef"


    // $ANTLR start "ruleCourseRef"
    // InternalCps.g:652:1: ruleCourseRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCourseRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCps.g:658:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCps.g:659:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCps.g:659:2: ( (otherlv_0= RULE_ID ) )
            // InternalCps.g:660:3: (otherlv_0= RULE_ID )
            {
            // InternalCps.g:660:3: (otherlv_0= RULE_ID )
            // InternalCps.g:661:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCourseRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCourseRefAccess().getCourseCourseCrossReference_0());
            			

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
    // $ANTLR end "ruleCourseRef"


    // $ANTLR start "ruleTerm"
    // InternalCps.g:675:1: ruleTerm returns [Enumerator current=null] : ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) ) ;
    public final Enumerator ruleTerm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCps.g:681:2: ( ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) ) )
            // InternalCps.g:682:2: ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) )
            {
            // InternalCps.g:682:2: ( (enumLiteral_0= 'FALL' ) | (enumLiteral_1= 'WINTER' ) | (enumLiteral_2= 'BOTH' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
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
                    // InternalCps.g:683:3: (enumLiteral_0= 'FALL' )
                    {
                    // InternalCps.g:683:3: (enumLiteral_0= 'FALL' )
                    // InternalCps.g:684:4: enumLiteral_0= 'FALL'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTermAccess().getFALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCps.g:691:3: (enumLiteral_1= 'WINTER' )
                    {
                    // InternalCps.g:691:3: (enumLiteral_1= 'WINTER' )
                    // InternalCps.g:692:4: enumLiteral_1= 'WINTER'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTermAccess().getWINTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCps.g:699:3: (enumLiteral_2= 'BOTH' )
                    {
                    // InternalCps.g:699:3: (enumLiteral_2= 'BOTH' )
                    // InternalCps.g:700:4: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}