package com.start.jickbangcopy_20220526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.jickbangcopy_20220526.databinding.ActivityViewRoomDetatilBinding
import com.start.jickbangcopy_20220526.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {

    lateinit var binding:ActivityViewRoomDetatilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_room_detatil)

        val roomData = intent.getSerializableExtra("room") as RoomData

        binding.txtPrice.text = roomData.getFormattedPrice()
        binding.txtDescription.text = roomData.description
        binding.txtAddress.text = roomData.address
        binding.txtFloor.text = roomData.getFormattedFloor()
    }
}