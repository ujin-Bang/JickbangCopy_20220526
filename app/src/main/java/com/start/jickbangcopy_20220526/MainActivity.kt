package com.start.jickbangcopy_20220526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.jickbangcopy_20220526.adapters.RoomAdapter
import com.start.jickbangcopy_20220526.databinding.ActivityMainBinding
import com.start.jickbangcopy_20220526.datas.RoomData

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val mRooms = ArrayList<RoomData>()

    lateinit var mRoomAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mRooms.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다"))
        mRooms.add(RoomData(18000, "서울시 서대문구", 0, "2번째 방입니다"))
        mRooms.add(RoomData(29700, "경기도 고양시", 17, "3번째 방입니다."))
        mRooms.add(RoomData(43000, "서울시 중구", -2, "4번째 방입니다."))
        mRooms.add(RoomData(175300, "서울시 송파구", 20, "5번째 방입니다."))

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item, mRooms)
        binding.roomListView.adapter = mRoomAdapter

    }
}