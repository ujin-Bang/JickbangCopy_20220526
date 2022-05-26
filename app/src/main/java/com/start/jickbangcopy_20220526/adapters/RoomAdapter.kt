package com.start.jickbangcopy_20220526.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.start.jickbangcopy_20220526.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>): ArrayAdapter<RoomData>(mContext, resId, mList) {
}