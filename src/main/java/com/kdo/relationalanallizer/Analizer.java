package com.kdo.relationalanallizer;

/**
 * <pre>
 * 각 테이블 별 관계에 있는 테이블
 * 테이블 대 테이블의 조인 조건
 * 테이블 대 테이블의 추정되는 관계
 * 테이블에서 사용되는 컬럼들
 *
 * 기타 오브젝트
 * 시너님
 * 시퀀스
 * 뷰
 * 프로시져
 * 펑션
 * </pre>
 * Created by kdo on 2015-10-27.
 */
public interface Analizer {
    public void analize(String sql);
}
