package com.tracking.lib.dto.common;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Pagination", description = "페이징 모델")
public class Pagination implements Serializable {

    private static final long serialVersionUID = -251528162755159591L;

    @Schema(description = "한 페이지당 게시글 수", defaultValue = "10")
    private int perPage = 10;

    @Schema(description = "한 블럭(range)당 페이지 수")
    private int rangeSize = 5;

    @Schema(description = "현재 페이지", defaultValue = "1")
    private int page = 1;

    @Schema(description = "현재 블럭(range)")
    private int curRange = 1;

    @Schema(description = "총 게시글 수")
    private int totalCount;

    @Schema(description = "총 페이지 수")
    private int pageCnt;

    @Schema(description = "총 블럭(range) 수")
    private int rangeCnt;

    @Schema(description = "시작 페이지")
    private int startPage = 1;

    @Schema(description = "끝 페이지")
    private int endPage = 1;

    @Schema(description = "시작 index", defaultValue = "1")
    private int startIndex = 1;

    @Schema(description = "이전 페이지")
    private int prevPage;

    @Schema(description = "다음 페이지")
    private int nextPage;

    @Schema(description = "이전 페이지 존재여부")
    private boolean existPrevPage;

    @Schema(description = "다음 페이지 존재여부")
    private boolean existNextPage;

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getRangeSize() {
        return rangeSize;
    }

    public void setRangeSize(int rangeSize) {
        this.rangeSize = rangeSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCurRange() {
        return curRange;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setListCnt(int totalCount) {
        /**
         * 페이징 처리 순서 1. 총 페이지수 2. 총 블럭(range)수 3. range setting
         */
        // 총 게시물 수와 현재 페이지를 Controller로 부터 받아온다.
        /** 현재 페이지 **/
        setPage(this.page);
        /** 총 게시물 수 **/
        this.totalCount = totalCount;
        /** 한 페이지당 데이터 수 **/
        setPerPage(this.perPage);

        /** 1. 총 페이지 수 **/
        setPageCnt(totalCount);
        /** 2. 총 블럭(range)수 **/
        setRangeCnt(this.pageCnt);
        /** 3. 블럭(range) setting **/
        rangeSetting(this.page);

        /** DB 질의를 위한 startIndex 설정 **/
        setStartIndex(this.page);
    }

    public int getPageCnt() {
        return pageCnt;
    }

    public int getRangeCnt() {
        return rangeCnt;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public Pagination() {}

    public Pagination(int page, int perPage) {
        /** 현재 페이지 **/
        setPage(page);

        /** 한 페이지당 데이터 수 **/
        setPerPage(perPage);
    }

    public Pagination(int totalCount, int page, int perPage) {
        /**
         * 페이징 처리 순서 1. 총 페이지수 2. 총 블럭(range)수 3. range setting
         */
        // 총 게시물 수와 현재 페이지를 Controller로 부터 받아온다.
        /** 현재 페이지 **/
        setPage(page);
        /** 총 게시물 수 **/
        setListCnt(totalCount);
        /** 한 페이지당 데이터 수 **/
        setPerPage(perPage);

        /** 1. 총 페이지 수 **/
        setPageCnt(totalCount);
        /** 2. 총 블럭(range)수 **/
        setRangeCnt(pageCnt);
        /** 3. 블럭(range) setting **/
        rangeSetting(page);

        /** DB 질의를 위한 startIndex 설정 **/
        setStartIndex(page);
    }

    public void setPageCnt(int totalCount) {
        this.pageCnt = (int) Math.ceil(totalCount * 1.0 / perPage);
    }

    public void setRangeCnt(int pageCnt) {
        this.rangeCnt = (int) Math.ceil(pageCnt * 1.0 / rangeSize);
    }

    public void rangeSetting(int page) {

        setCurRange(page);
        this.startPage = (curRange - 1) * rangeSize + 1;
        this.endPage = startPage + rangeSize - 1;

        if (endPage > pageCnt) {
            this.endPage = pageCnt;
        }

        this.prevPage = page - 1;
        this.nextPage = page + 1;

        this.existPrevPage = (this.prevPage >= 1);
        this.existNextPage = (this.nextPage <= this.pageCnt);
    }

    public void setCurRange(int curPage) {
        this.curRange = (int) ((curPage - 1) / rangeSize) + 1;
    }

    public void setStartIndex(int curPage) {
        this.startIndex = (curPage - 1) * perPage;
    }

    public boolean isExistPrevPage() {
        return existPrevPage;
    }

    public boolean isExistNextPage() {
        return existNextPage;
    }
}
