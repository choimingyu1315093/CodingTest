package com.choimingyu.hicarenettest.data.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.choimingyu.hicarenettest.data.entity.FacilityEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FacilityDao_Impl implements FacilityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FacilityEntity> __insertionAdapterOfFacilityEntity;

  public FacilityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFacilityEntity = new EntityInsertionAdapter<FacilityEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `FacilityEntity` (`facilityId`,`facilityName`,`logoUrl`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FacilityEntity value) {
        if (value.getFacilityId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFacilityId());
        }
        if (value.getFacilityName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFacilityName());
        }
        if (value.getLogoUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLogoUrl());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<FacilityEntity> facilities,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFacilityEntity.insert(facilities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final FacilityEntity facility,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFacilityEntity.insert(facility);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<FacilityEntity>> getAllFacilities() {
    final String _sql = "SELECT * FROM FacilityEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"FacilityEntity"}, false, new Callable<List<FacilityEntity>>() {
      @Override
      public List<FacilityEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFacilityId = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityId");
          final int _cursorIndexOfFacilityName = CursorUtil.getColumnIndexOrThrow(_cursor, "facilityName");
          final int _cursorIndexOfLogoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "logoUrl");
          final List<FacilityEntity> _result = new ArrayList<FacilityEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FacilityEntity _item;
            final String _tmpFacilityId;
            if (_cursor.isNull(_cursorIndexOfFacilityId)) {
              _tmpFacilityId = null;
            } else {
              _tmpFacilityId = _cursor.getString(_cursorIndexOfFacilityId);
            }
            final String _tmpFacilityName;
            if (_cursor.isNull(_cursorIndexOfFacilityName)) {
              _tmpFacilityName = null;
            } else {
              _tmpFacilityName = _cursor.getString(_cursorIndexOfFacilityName);
            }
            final String _tmpLogoUrl;
            if (_cursor.isNull(_cursorIndexOfLogoUrl)) {
              _tmpLogoUrl = null;
            } else {
              _tmpLogoUrl = _cursor.getString(_cursorIndexOfLogoUrl);
            }
            _item = new FacilityEntity(_tmpFacilityId,_tmpFacilityName,_tmpLogoUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
