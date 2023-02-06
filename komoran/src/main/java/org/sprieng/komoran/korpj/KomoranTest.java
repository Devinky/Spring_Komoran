package org.sprieng.komoran.korpj;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

import java.util.List;

public class KomoranTest {

	public static void main(String[] args) {

		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);

		String testStr = "java, spring, sql, html, css, oracle, thymeleaf, javascript";
		KomoranResult komoranResult = komoran.analyze(testStr);

		System.out.println(komoranResult.getPlainText()); //komoran이 분석한 텍스트 결과를 get
		//우리/NP 는/JX 웹 개발자/NNP 이/VCP 라네/EC ~/SO
		List<Token> tokenList = komoranResult.getTokenList();

		for(Token token: tokenList){
			System.out.println(token);
			System.out.format("(%02d, %2d) %s/%s\n",
							token.getBeginIndex(),
							token.getEndIndex(),
							token.getMorph(),
							token.getPos());
			System.out.println(token.getMorph().toString().equals("java"));

			if(token.getMorph().toString().equals("java")){
				System.out.println("동지 ㅎㅇ~");
			}
		}

	}

}
