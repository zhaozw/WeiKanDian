package me.anany.weikandian.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import me.anany.weikandian.db.entity.HomeItemDB;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HomeItemDB".
*/
public class HomeItemDBDao extends AbstractDao<HomeItemDB, Long> {

    public static final String TABLENAME = "HomeItemDB";

    /**
     * Properties of entity HomeItemDB.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Is_read = new Property(1, String.class, "is_read", false, "IS_READ");
        public final static Property Position = new Property(2, String.class, "position", false, "POSITION");
        public final static Property Step = new Property(3, String.class, "step", false, "STEP");
        public final static Property Ct = new Property(4, String.class, "ct", false, "CT");
        public final static Property Input_time = new Property(5, String.class, "input_time", false, "INPUT_TIME");
        public final static Property Catid = new Property(6, String.class, "catid", false, "CATID");
        public final static Property Thumb = new Property(7, String.class, "thumb", false, "THUMB");
        public final static Property Idx = new Property(8, String.class, "idx", false, "IDX");
        public final static Property Account_id = new Property(9, String.class, "account_id", false, "ACCOUNT_ID");
        public final static Property Isext = new Property(10, String.class, "isext", false, "ISEXT");
        public final static Property Title = new Property(11, String.class, "title", false, "TITLE");
        public final static Property Read_num = new Property(12, String.class, "read_num", false, "READ_NUM");
        public final static Property Like_num = new Property(13, String.class, "like_num", false, "LIKE_NUM");
        public final static Property Share_num = new Property(14, String.class, "share_num", false, "SHARE_NUM");
        public final static Property Wurl = new Property(15, String.class, "wurl", false, "WURL");
        public final static Property Video = new Property(16, String.class, "video", false, "VIDEO");
        public final static Property Image_type = new Property(17, String.class, "image_type", false, "IMAGE_TYPE");
        public final static Property Op_mark = new Property(18, String.class, "op_mark", false, "OP_MARK");
        public final static Property Op_mark_iurl = new Property(19, String.class, "op_mark_iurl", false, "OP_MARK_IURL");
        public final static Property Op_mark_icolor = new Property(20, String.class, "op_mark_icolor", false, "OP_MARK_ICOLOR");
        public final static Property Account_name = new Property(21, String.class, "account_name", false, "ACCOUNT_NAME");
        public final static Property Url = new Property(22, String.class, "url", false, "URL");
        public final static Property Is_cache = new Property(23, String.class, "is_cache", false, "IS_CACHE");
        public final static Property Article_type = new Property(24, String.class, "article_type", false, "ARTICLE_TYPE");
        public final static Property Behot_time = new Property(25, String.class, "behot_time", false, "BEHOT_TIME");
        public final static Property ExtraImg = new Property(26, String.class, "extraImg", false, "EXTRA_IMG");
    };

    private DaoSession daoSession;


    public HomeItemDBDao(DaoConfig config) {
        super(config);
    }
    
    public HomeItemDBDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HomeItemDB\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IS_READ\" TEXT," + // 1: is_read
                "\"POSITION\" TEXT," + // 2: position
                "\"STEP\" TEXT," + // 3: step
                "\"CT\" TEXT," + // 4: ct
                "\"INPUT_TIME\" TEXT," + // 5: input_time
                "\"CATID\" TEXT," + // 6: catid
                "\"THUMB\" TEXT," + // 7: thumb
                "\"IDX\" TEXT," + // 8: idx
                "\"ACCOUNT_ID\" TEXT," + // 9: account_id
                "\"ISEXT\" TEXT," + // 10: isext
                "\"TITLE\" TEXT," + // 11: title
                "\"READ_NUM\" TEXT," + // 12: read_num
                "\"LIKE_NUM\" TEXT," + // 13: like_num
                "\"SHARE_NUM\" TEXT," + // 14: share_num
                "\"WURL\" TEXT," + // 15: wurl
                "\"VIDEO\" TEXT," + // 16: video
                "\"IMAGE_TYPE\" TEXT," + // 17: image_type
                "\"OP_MARK\" TEXT," + // 18: op_mark
                "\"OP_MARK_IURL\" TEXT," + // 19: op_mark_iurl
                "\"OP_MARK_ICOLOR\" TEXT," + // 20: op_mark_icolor
                "\"ACCOUNT_NAME\" TEXT," + // 21: account_name
                "\"URL\" TEXT," + // 22: url
                "\"IS_CACHE\" TEXT," + // 23: is_cache
                "\"ARTICLE_TYPE\" TEXT," + // 24: article_type
                "\"BEHOT_TIME\" TEXT," + // 25: behot_time
                "\"EXTRA_IMG\" TEXT);"); // 26: extraImg
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_HomeItemDB_ID ON HomeItemDB" +
                " (\"ID\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HomeItemDB\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HomeItemDB entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String is_read = entity.getIs_read();
        if (is_read != null) {
            stmt.bindString(2, is_read);
        }
 
        String position = entity.getPosition();
        if (position != null) {
            stmt.bindString(3, position);
        }
 
        String step = entity.getStep();
        if (step != null) {
            stmt.bindString(4, step);
        }
 
        String ct = entity.getCt();
        if (ct != null) {
            stmt.bindString(5, ct);
        }
 
        String input_time = entity.getInput_time();
        if (input_time != null) {
            stmt.bindString(6, input_time);
        }
 
        String catid = entity.getCatid();
        if (catid != null) {
            stmt.bindString(7, catid);
        }
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(8, thumb);
        }
 
        String idx = entity.getIdx();
        if (idx != null) {
            stmt.bindString(9, idx);
        }
 
        String account_id = entity.getAccount_id();
        if (account_id != null) {
            stmt.bindString(10, account_id);
        }
 
        String isext = entity.getIsext();
        if (isext != null) {
            stmt.bindString(11, isext);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(12, title);
        }
 
        String read_num = entity.getRead_num();
        if (read_num != null) {
            stmt.bindString(13, read_num);
        }
 
        String like_num = entity.getLike_num();
        if (like_num != null) {
            stmt.bindString(14, like_num);
        }
 
        String share_num = entity.getShare_num();
        if (share_num != null) {
            stmt.bindString(15, share_num);
        }
 
        String wurl = entity.getWurl();
        if (wurl != null) {
            stmt.bindString(16, wurl);
        }
 
        String video = entity.getVideo();
        if (video != null) {
            stmt.bindString(17, video);
        }
 
        String image_type = entity.getImage_type();
        if (image_type != null) {
            stmt.bindString(18, image_type);
        }
 
        String op_mark = entity.getOp_mark();
        if (op_mark != null) {
            stmt.bindString(19, op_mark);
        }
 
        String op_mark_iurl = entity.getOp_mark_iurl();
        if (op_mark_iurl != null) {
            stmt.bindString(20, op_mark_iurl);
        }
 
        String op_mark_icolor = entity.getOp_mark_icolor();
        if (op_mark_icolor != null) {
            stmt.bindString(21, op_mark_icolor);
        }
 
        String account_name = entity.getAccount_name();
        if (account_name != null) {
            stmt.bindString(22, account_name);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(23, url);
        }
 
        String is_cache = entity.getIs_cache();
        if (is_cache != null) {
            stmt.bindString(24, is_cache);
        }
 
        String article_type = entity.getArticle_type();
        if (article_type != null) {
            stmt.bindString(25, article_type);
        }
 
        String behot_time = entity.getBehot_time();
        if (behot_time != null) {
            stmt.bindString(26, behot_time);
        }
 
        String extraImg = entity.getExtraImg();
        if (extraImg != null) {
            stmt.bindString(27, extraImg);
        }
    }

    @Override
    protected void attachEntity(HomeItemDB entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HomeItemDB readEntity(Cursor cursor, int offset) {
        HomeItemDB entity = new HomeItemDB( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // is_read
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // position
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // step
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ct
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // input_time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // catid
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // thumb
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // idx
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // account_id
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // isext
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // title
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // read_num
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // like_num
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // share_num
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // wurl
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // video
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // image_type
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // op_mark
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // op_mark_iurl
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // op_mark_icolor
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // account_name
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // url
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // is_cache
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // article_type
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // behot_time
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26) // extraImg
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HomeItemDB entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIs_read(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPosition(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStep(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCt(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setInput_time(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCatid(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setThumb(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIdx(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAccount_id(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIsext(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTitle(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRead_num(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setLike_num(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setShare_num(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setWurl(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setVideo(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setImage_type(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setOp_mark(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setOp_mark_iurl(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setOp_mark_icolor(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setAccount_name(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setUrl(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setIs_cache(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setArticle_type(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setBehot_time(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setExtraImg(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HomeItemDB entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HomeItemDB entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}