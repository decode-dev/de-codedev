using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MJ_Test
{
    public partial class TextMover : Form
    {
        int i;
        public TextMover()
        {
            InitializeComponent();
        }
        int[] x ={
                     (int)ContentAlignment.BottomRight,
                     (int)ContentAlignment.BottomCenter,
                     (int)ContentAlignment.BottomLeft,
                     (int)ContentAlignment.MiddleRight,
                     (int)ContentAlignment.MiddleLeft,
                     (int)ContentAlignment.TopCenter,
                     (int)ContentAlignment.TopRight,
                     (int)ContentAlignment.TopLeft,
                 };

        private void button1_Click(object sender, EventArgs e)
        {
            tmr.Enabled = true;
            tmr.Enabled = false;
        }

        private void btn_stop_Click(object sender, EventArgs e)
        {
            tmr.Enabled = false;
        }

        private void tmr_Tick(object sender, EventArgs e)
        {
            i = i + 1;
            if(i==8)
            {
                i = 0;
            }
            lbl_mvr.TextAlign = (ContentAlignment)x[i];
        }
    }
}
