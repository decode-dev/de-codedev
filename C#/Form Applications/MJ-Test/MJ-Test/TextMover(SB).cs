using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Globalization;

namespace MJ_Test
{
    public partial class TextMover_SB : Form
    {
        int i;
        public TextMover_SB()
        {
            InitializeComponent();
        }
        private bool _tmr_running = false;
        int[] x =
        {
                     (int)ContentAlignment.BottomRight,
                     (int)ContentAlignment.BottomCenter,
                     (int)ContentAlignment.BottomLeft,
                     (int)ContentAlignment.MiddleRight,
                     (int)ContentAlignment.MiddleLeft,
                     (int)ContentAlignment.TopCenter,
                     (int)ContentAlignment.TopRight,
                     (int)ContentAlignment.TopLeft,
                 };

        private void strt_btn_Click(object sender, EventArgs e)
        {
            if(!_tmr_running )
            {
                tmr_sb.Start();
                _tmr_running = true;
            }
            else
            {
                tmr_sb.Stop();
                _tmr_running = false;
            }

        }

        private void tmr_sb_Tick(object sender, EventArgs e)
        {
            i = i + 1;
            if (i == 8)
            {
                i = 0;
            }
            pic_lbl.Text = "The Matrix has you..." + "\r\t\n" + "Follow the White Rabbit..." + "\r\t\n" + "Knock knock, Neo.";
            pic_lbl.TextAlign = (ContentAlignment)x[i];
        }

        private void pic_lbl1_Click(object sender, EventArgs e)
        {
            
        }

        private void pic_l_Click(object sender, EventArgs e)
        {

        }

        private void TextMover_SB_Load(object sender, EventArgs e)
        {
            
        }
    }
}
