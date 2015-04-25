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
    public partial class MultiX : Form
    {
        public MultiX()
        {
            InitializeComponent();
        }

        private void mulbn_Click(object sender, EventArgs e)
        {
            int num, rng;
            num = Int32.Parse(notb.Text.Trim());
            rng = Int32.Parse(rngtb.Text.Trim());
            for (int i = 1; i <= rng; i++)
            {
                int rst = num * i;
                multb.Text+=(num+"x"+i+"="+rst+";");
            }
            
        }

        void multb_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            throw new NotImplementedException();
        }

        private void MultiX_Load(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            TextMover tm = new TextMover();
            tm.Show();
            Hide();
        }
    }
}
