package me.anany.weikandian.db.entity;

import me.anany.weikandian.db.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import me.anany.weikandian.db.dao.HomeItemDBDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "HomeItemDB".
 */
public class HomeItemDB {

    private Long id;
    private String is_read;
    private String position;
    private String step;
    private String ct;
    private String input_time;
    private String catid;
    private String thumb;
    private String idx;
    private String account_id;
    private String isext;
    private String title;
    private String read_num;
    private String like_num;
    private String share_num;
    private String wurl;
    private String video;
    private String image_type;
    private String op_mark;
    private String op_mark_iurl;
    private String op_mark_icolor;
    private String account_name;
    private String url;
    private String is_cache;
    private String article_type;
    private String behot_time;
    private String extraImg;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient HomeItemDBDao myDao;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public HomeItemDB() {
    }

    public HomeItemDB(Long id) {
        this.id = id;
    }

    public HomeItemDB(Long id, String is_read, String position, String step, String ct, String input_time, String catid, String thumb, String idx, String account_id, String isext, String title, String read_num, String like_num, String share_num, String wurl, String video, String image_type, String op_mark, String op_mark_iurl, String op_mark_icolor, String account_name, String url, String is_cache, String article_type, String behot_time, String extraImg) {
        this.id = id;
        this.is_read = is_read;
        this.position = position;
        this.step = step;
        this.ct = ct;
        this.input_time = input_time;
        this.catid = catid;
        this.thumb = thumb;
        this.idx = idx;
        this.account_id = account_id;
        this.isext = isext;
        this.title = title;
        this.read_num = read_num;
        this.like_num = like_num;
        this.share_num = share_num;
        this.wurl = wurl;
        this.video = video;
        this.image_type = image_type;
        this.op_mark = op_mark;
        this.op_mark_iurl = op_mark_iurl;
        this.op_mark_icolor = op_mark_icolor;
        this.account_name = account_name;
        this.url = url;
        this.is_cache = is_cache;
        this.article_type = article_type;
        this.behot_time = behot_time;
        this.extraImg = extraImg;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getHomeItemDBDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIs_read() {
        return is_read;
    }

    public void setIs_read(String is_read) {
        this.is_read = is_read;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getInput_time() {
        return input_time;
    }

    public void setInput_time(String input_time) {
        this.input_time = input_time;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getIsext() {
        return isext;
    }

    public void setIsext(String isext) {
        this.isext = isext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRead_num() {
        return read_num;
    }

    public void setRead_num(String read_num) {
        this.read_num = read_num;
    }

    public String getLike_num() {
        return like_num;
    }

    public void setLike_num(String like_num) {
        this.like_num = like_num;
    }

    public String getShare_num() {
        return share_num;
    }

    public void setShare_num(String share_num) {
        this.share_num = share_num;
    }

    public String getWurl() {
        return wurl;
    }

    public void setWurl(String wurl) {
        this.wurl = wurl;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public String getOp_mark() {
        return op_mark;
    }

    public void setOp_mark(String op_mark) {
        this.op_mark = op_mark;
    }

    public String getOp_mark_iurl() {
        return op_mark_iurl;
    }

    public void setOp_mark_iurl(String op_mark_iurl) {
        this.op_mark_iurl = op_mark_iurl;
    }

    public String getOp_mark_icolor() {
        return op_mark_icolor;
    }

    public void setOp_mark_icolor(String op_mark_icolor) {
        this.op_mark_icolor = op_mark_icolor;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIs_cache() {
        return is_cache;
    }

    public void setIs_cache(String is_cache) {
        this.is_cache = is_cache;
    }

    public String getArticle_type() {
        return article_type;
    }

    public void setArticle_type(String article_type) {
        this.article_type = article_type;
    }

    public String getBehot_time() {
        return behot_time;
    }

    public void setBehot_time(String behot_time) {
        this.behot_time = behot_time;
    }

    public String getExtraImg() {
        return extraImg;
    }

    public void setExtraImg(String extraImg) {
        this.extraImg = extraImg;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
